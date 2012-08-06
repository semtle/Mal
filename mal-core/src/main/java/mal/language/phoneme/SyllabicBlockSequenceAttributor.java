package mal.language.phoneme;

import mal.language.letter.SyllableSequence;

public interface SyllabicBlockSequenceAttributor {
    public AttributedSyllabicBlockSequence build(SyllableSequence filteredSyllableSequence);
}
