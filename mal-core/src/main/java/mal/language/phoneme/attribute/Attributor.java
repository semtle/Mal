package mal.language.phoneme.attribute;

import mal.language.syllable.Syllable;

import java.util.List;

public interface Attributor {
    public List<AttributedSyllabicBlock> attribute(List<Syllable> syllables);
}
