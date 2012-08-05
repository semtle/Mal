package mal.korean.voice;

import mal.korean.phoneme.Phoneme;

import java.io.File;
import java.util.Map;


/**
 * A {@code Voice} is a set of {@code FlatPhone}s.
 */
public class Voice {
    private String name;

    private File directory;

    private Map<Phoneme, FlatPhone> phoneMap;

    FlatPhone phone(Phoneme phoneme) {
        throw new UnsupportedOperationException();
    }
}
