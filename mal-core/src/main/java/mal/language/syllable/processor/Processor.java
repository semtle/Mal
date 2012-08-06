package mal.language.syllable.processor;

import mal.language.syllable.Syllable;

import java.util.List;

public interface Processor {
    List<Syllable> process(List<Syllable> syllables);
}
