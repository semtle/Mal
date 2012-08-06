package mal.language.voice;

import java.io.File;
import java.util.Map;


/**
 * A {@code PhoneSet} is a set of {@code NormalPhone}s.
 */
public class PhoneSet {
    private String name;

    private File directory;

    private Map<Phoneme, NormalPhone> phoneMap;

    NormalPhone phone(Phoneme phoneme) {
        throw new UnsupportedOperationException();
    }
}
