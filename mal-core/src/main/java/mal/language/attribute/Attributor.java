package mal.language.attribute;

import mal.language.letter.SyllableSequence;

public interface Attributor {
    public AttributedSyllabicBlockSequence attribute(SyllableSequence filteredSyllableSequence);
}
