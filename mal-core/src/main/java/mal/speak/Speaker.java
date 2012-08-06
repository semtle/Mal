package mal.speak;

import mal.audioplayer.AudioPlayer;
import mal.language.phone.AttributedPhone;
import mal.language.phone.PhoneSet;
import mal.language.phoneme.attribute.AttributedPhoneme;
import mal.language.phoneme.attribute.AttributedSyllabicBlock;
import mal.language.phoneme.attribute.Attributor;
import mal.language.phoneme.attribute.RokStandardAttributor;
import mal.language.phoneme.attribute.splitter.Splitter;
import mal.language.syllable.Syllable;
import mal.language.syllable.SyllableListBuilder;
import mal.language.syllable.processor.CompositeProcessor;
import mal.language.syllable.processor.Processor;

import java.util.List;


/**
 * A {@code Speaker} speaks a text in a phoneSet.
 */
public class Speaker {
    private Prompter prompter;
    private PhoneSet phoneSet;
    private Splitter splitter;
    private AudioPlayer audioPlayer;
    private AttributedPhone currentAttributedPhone;
    private Processor filter = new CompositeProcessor();
    private Attributor attributor = new RokStandardAttributor();

    public void speak(String text) {
        List<Syllable> originalSyllables = SyllableListBuilder.build(text);
        List<Syllable> filteredSyllables = filter.process(originalSyllables);
        List<AttributedSyllabicBlock> attributedSyllabicBlock = attributor.attribute(filteredSyllables);
        List<AttributedPhoneme> phonemes = splitter.build(attributedSyllabicBlock);
        prompter.prepare(phonemes);
        while (prompter.hasNext()) {
            currentAttributedPhone = phoneSet.map(prompter.next());
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
