package mal.language.phoneme.builder;

import mal.language.letter.SyllabicBlockSequence;

import java.util.List;

public interface PhonemeBuilder {
    List<SyllabicBlockSequence> split(SyllabicBlockSequence syllabicBlockSequence);
}
