package mal.language.phone.splitter;

import mal.language.phone.attribute.AttributedPhoneme;
import mal.language.phone.attribute.AttributedSyllabicBlock;

import java.util.List;

public interface Splitter {
    List<AttributedPhoneme> build(List<AttributedSyllabicBlock> attributedSyllabicBlocks);
}
