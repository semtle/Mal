package mal;

import mal.audioplayer.AudioPlayer;
import mal.language.letter.SyllabicBlockSequence;
import mal.language.letter.SyllabicBlockSequenceBuilder;
import mal.language.phoneme.PhonemeSequenceBuilder;
import mal.language.voice.AttributedPhone;
import mal.language.voice.PhoneSet;

import java.util.List;


/**
 * A {@code Speaker} speaks a text in a phoneSet.
 */
public class Speaker {
    private Prompter prompter;

    private PhoneSet phoneSet;

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
