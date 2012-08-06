package mal.language.phone.attribute;

import mal.language.letter.SyllableSequence;

public class NullAttributor implements Attributor {
    @Override
    public AttributedSyllabicBlockSequence attribute(SyllableSequence filteredSyllableSequence) {
        throw new UnsupportedOperationException();
    }
}
