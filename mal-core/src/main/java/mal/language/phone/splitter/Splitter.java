package mal.language.phone.splitter;

import mal.language.phone.attribute.AttributedSyllabicBlockSequence;
import mal.language.phone.attribute.AttributedPhonemeSequence;

public interface Splitter {
    AttributedPhonemeSequence build(AttributedSyllabicBlockSequence attributedSyllabicBlockSequence);
}
