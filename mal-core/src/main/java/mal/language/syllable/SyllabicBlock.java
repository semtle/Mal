package mal.language.syllable;

import java.util.Arrays;
import java.util.Iterator;

/**
 * A {@code SyllabicBlock} is
 */
public class SyllabicBlock implements Iterable<Letter>, Syllable {
    private InitialLetter initialLetter;
    private MedialLetter medialLetter;
    private FinalLetter finalLetter;

    public InitialLetter getInitialLetter() {
        return initialLetter;
    }

    public MedialLetter getMedialLetter() {
        return medialLetter;
    }

    public FinalLetter getFinalLetter() {
        return finalLetter;
    }

    public boolean hasFinalLetter() {
        return finalLetter != null;
    }

    public Iterator<Letter> iterator() {
        if (this.hasFinalLetter()) {
            return Arrays.<Letter>asList(initialLetter, medialLetter).iterator();
        } else {
            return Arrays.<Letter>asList(initialLetter, medialLetter, finalLetter).iterator();
        }
    }
}
