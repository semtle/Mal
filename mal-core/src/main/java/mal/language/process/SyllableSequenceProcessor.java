package mal.language.process;

import mal.language.letter.SyllableSequence;

public interface SyllableSequenceProcessor {
    SyllableSequence process(SyllableSequence normalizedSyllableSequence);
}
