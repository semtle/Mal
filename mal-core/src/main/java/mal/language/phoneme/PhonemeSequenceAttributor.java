package mal.language.phoneme;

public interface PhonemeSequenceAttributor {
    AttributedPhonemeSequence build(AttributedSyllabicBlockSequence attributedSyllabicBlockSequence);
}
