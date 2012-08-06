package mal.language.voice;

import mal.language.phone.Phoneme;

import java.io.File;


/**
 * A {@code NormalPhone} represents a unit of spoken language. In other words, a phone is a spoken
 * splitter in a phoneSet.
 *
 * @see PhoneSet#phone(mal.language.phone.Phoneme)
 */
public class NormalPhone {
    private Phoneme phoneme;

    private PhoneSet phoneSet;

    private File sound;

    File getSound() {
        return sound;
    }

    Phoneme getPhoneme() {
        return phoneme;
    }

    PhoneSet getPhoneSet() {
        return phoneSet;
    }
}
