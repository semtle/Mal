package mal;

import java.io.File;
import java.util.Map;

/**
 * A {@code Voice} is a set of {@code FlatPhone}s.
 */
class Voice {
    private String name;

    private File directory;

    private Map<Phoneme, FlatPhone> phoneMap;

    FlatPhone phone(Phoneme phoneme) {
        throw new UnsupportedOperationException();
    }
}
