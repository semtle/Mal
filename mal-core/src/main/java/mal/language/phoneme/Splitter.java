package mal.language.phoneme;

public interface Splitter {
    AttributedPhonemeSequence build(AttributedSyllabicBlockSequence attributedSyllabicBlockSequence);
}
