package mal.language.phone.process;

import mal.language.letter.SyllableSequence;

public class NullPronunciationProcessor implements SyllableSequenceProcessor {
    @Override
    public SyllableSequence process(SyllableSequence normalizedSyllableSequence) {
        throw new UnsupportedOperationException();
    }
}
