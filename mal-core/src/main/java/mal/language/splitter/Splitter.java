package mal.language.splitter;

import mal.language.attribute.AttributedSyllabicBlockSequence;
import mal.language.attribute.AttributedPhonemeSequence;

public interface Splitter {
    AttributedPhonemeSequence build(AttributedSyllabicBlockSequence attributedSyllabicBlockSequence);
}
