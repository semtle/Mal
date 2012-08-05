package mal;

import mal.korean.grapheme.SyllabicBlockSequence;
import mal.korean.grapheme.SyllabicBlockSequenceBuilder;
import mal.korean.phoneme.PhonemeSequenceBuilder;
import mal.korean.voice.AttributedPhone;
import mal.korean.voice.Voice;

import java.util.List;


/**
 * A {@code Speaker} speaks a text in a voice.
 */
public class Speaker {
    private Prompter prompter;

    private Voice voice;

    private PhonemeSequenceBuilder phonemeSequenceBuilder;

    private AudioPlayer audioPlayer;

    private AttributedPhone currentAttributedPhone;

    public void speak(String text) {
        SyllabicBlockSequence syllabicBlockSequence = SyllabicBlockSequenceBuilder.build(text);
        List<AttributedPhone> analyzed = phonemeSequenceBuilder.analyze(syllabicBlockSequence);
        prompter.prepare(analyzed);
        while (prompter.hasNext()) {
            currentAttributedPhone = prompter.next();
            audioPlayer.playAndWait(currentAttributedPhone);
        }
    }

    public void stop() {
        prompter.stop();
        audioPlayer.stop();
    }

    public void setVolume(float volume) {
        audioPlayer.setVolume(volume);
    }

    public float getVolume() {
        return audioPlayer.getVolume();
    }

    public void setVoice() {
        throw new UnsupportedOperationException();
    }

    public void setSpeed(float speed) {
        audioPlayer.setSpeed(speed);
    }

    public float getSpeed() {
        return audioPlayer.getSpeed();
    }
}
