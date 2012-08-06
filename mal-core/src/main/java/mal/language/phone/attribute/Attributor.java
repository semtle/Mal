package mal.language.phone.attribute;

import mal.language.letter.Syllable;

import java.util.List;

public interface Attributor {
    public List<AttributedSyllabicBlock> attribute(List<Syllable> syllables);
}
