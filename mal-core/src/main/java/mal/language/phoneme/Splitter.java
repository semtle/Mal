package mal.language.phoneme;

import mal.language.voice.AttributedPhonemeSequence;

public interface Splitter {
    AttributedPhonemeSequence build(AttributedSyllabicBlockSequence attributedSyllabicBlockSequence);
}
