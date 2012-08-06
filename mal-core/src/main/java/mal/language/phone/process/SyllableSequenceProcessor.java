package mal.language.phone.process;

import mal.language.letter.SyllableSequence;

public interface SyllableSequenceProcessor {
    SyllableSequence process(SyllableSequence normalizedSyllableSequence);
}
