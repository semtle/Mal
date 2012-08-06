package mal.language.phoneme.attribute;

import mal.language.syllable.Syllable;

import java.util.List;

public class NullAttributor implements Attributor {
    public List<AttributedSyllabicBlock> attribute(List<Syllable> syllables) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
