package mal.speak;

import mal.audioplayer.AudioPlayer;
import mal.language.attribute.Attributor;
import mal.language.attribute.RokStandardAttributor;
import mal.language.splitter.Splitter;
import mal.language.process.CompositeProcessor;
import mal.language.process.SyllableSequenceProcessor;
import mal.language.attribute.AttributedSyllabicBlockSequence;
import mal.language.letter.SyllableSequence;
import mal.language.letter.SyllableSequenceBuilder;
import mal.language.attribute.AttributedPhonemeSequence;
import mal.language.attribute.AttributedPhone;
import mal.language.voice.PhoneSet;


/**
 * A {@code Speaker} speaks a text in a phoneSet.
 */
public class Speaker {
    private Prompter prompter;
    private PhoneSet phoneSet;
    private Splitter splitter;
    private AudioPlayer audioPlayer;
    private AttributedPhone currentAttributedPhone;
    private SyllableSequenceProcessor filter = new CompositeProcessor();
    private Attributor attributor = new RokStandardAttributor();

    public void speak(String text) {
        SyllableSequence originalSyllableSequence = SyllableSequenceBuilder.build(text);
        SyllableSequence filteredSyllableSequence = filter.process(originalSyllableSequence);
        AttributedSyllabicBlockSequence attributedSyllabicBlock = attributor.attribute(filteredSyllableSequence);
        AttributedPhonemeSequence phonemeSequence = splitter.build(attributedSyllabicBlock);
        prompter.prepare(phonemeSequence);
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
