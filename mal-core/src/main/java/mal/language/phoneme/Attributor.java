package mal.language.phoneme;

import mal.language.letter.SyllableSequence;

public interface Attributor {
    public AttributedSyllabicBlockSequence attribute(SyllableSequence filteredSyllableSequence);
}
