package mal.korean.voice;

import mal.korean.phoneme.Phoneme;

import java.io.File;


/**
 * A {@code FlatPhone} represents a unit of spoken language. In other words, a phone is a spoken
 * phoneme in a voice.
 *
 * @see Voice#phone(mal.korean.phoneme.Phoneme)
 */
public class FlatPhone {
    private Phoneme phoneme;

    private Voice voice;

    private File sound;

    File getSound() {
        return sound;
    }

    Phoneme getPhoneme() {
        return phoneme;
    }

    Voice getVoice() {
        return voice;
    }
}
