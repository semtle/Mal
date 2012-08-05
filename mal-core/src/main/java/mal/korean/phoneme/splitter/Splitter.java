package mal.korean.phoneme.splitter;

import mal.korean.grapheme.SyllabicBlockSequence;

import java.util.List;

public interface Splitter {
    List<SyllabicBlockSequence> split(SyllabicBlockSequence syllabicBlockSequence);
}
