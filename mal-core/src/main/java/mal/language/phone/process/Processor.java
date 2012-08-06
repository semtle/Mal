package mal.language.phone.process;

import mal.language.letter.Syllable;

import java.util.List;

public interface Processor {
    List<Syllable> process(List<Syllable> syllables);
}
