package mal.language.phone.attribute;

import mal.language.letter.SyllableSequence;

public interface Attributor {
    public AttributedSyllabicBlockSequence attribute(SyllableSequence filteredSyllableSequence);
}
