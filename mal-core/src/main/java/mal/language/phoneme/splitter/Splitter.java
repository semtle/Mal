package mal.language.phoneme.splitter;

import mal.language.phoneme.attribute.AttributedPhoneme;
import mal.language.phoneme.attribute.AttributedSyllabicBlock;

import java.util.List;

public interface Splitter {
    List<AttributedPhoneme> build(List<AttributedSyllabicBlock> attributedSyllabicBlocks);
}
