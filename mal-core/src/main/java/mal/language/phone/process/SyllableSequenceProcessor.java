package mal.language.phone.process;

import mal.language.letter.Syllable;

import java.util.List;

public interface SyllableSequenceProcessor {
    List<Syllable> process(List<Syllable> syllables);
}
