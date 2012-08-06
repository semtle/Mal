package mal;

import mal.audioplayer.AudioPlayer;
import mal.audioplayer.Prompter;
import mal.language.phoneme.PhonemeSequenceAttributor;
import mal.language.phoneme.RokStandardSyllabicBlockSequenceAttributor;
import mal.language.phoneme.SyllabicBlockSequenceAttributor;
import mal.language.process.CompositeProcessor;
import mal.language.process.SyllableSequenceProcessor;
import mal.language.phoneme.AttributedSyllabicBlockSequence;
import mal.language.letter.SyllableSequence;
import mal.language.letter.SyllableSequenceBuilder;
import mal.language.phoneme.AttributedPhonemeSequence;
import mal.language.voice.AttributedPhone;
import mal.language.voice.PhoneSet;


/**
 * A {@code Speaker} speaks a text in a phoneSet.
 */
public class Speaker {
    private Prompter prompter;
    private PhoneSet phoneSet;
    private PhonemeSequenceAttributor phonemeSequenceAttributor;
    private AudioPlayer audioPlayer;
    private AttributedPhone currentAttributedPhone;
    private SyllableSequenceProcessor filter = new CompositeProcessor();
    private SyllabicBlockSequenceAttributor syllabicBlockSequenceAttributor = new RokStandardSyllabicBlockSequenceAttributor();

    public void speak(String text) {
        SyllableSequence originalSyllableSequence = SyllableSequenceBuilder.build(text);
        SyllableSequence filteredSyllableSequence = filter.process(originalSyllableSequence);
        AttributedSyllabicBlockSequence attributedSyllabicBlock = syllabicBlockSequenceAttributor.build(filteredSyllableSequence);
        AttributedPhonemeSequence phonemeSequence = phonemeSequenceAttributor.build(attributedSyllabicBlock);
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
