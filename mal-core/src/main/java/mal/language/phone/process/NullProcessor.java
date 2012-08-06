package mal.language.phone.process;

import mal.language.letter.SyllableSequence;

public class NullProcessor implements SyllableSequenceProcessor {
    @Override
    public SyllableSequence process(SyllableSequence normalizedSyllableSequence) {
        throw new UnsupportedOperationException();
    }
}
