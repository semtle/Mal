package mal.speak;

import mal.language.phoneme.attribute.AttributedPhoneme;

import java.util.List;


public class Prompter {
    private List<AttributedPhoneme> script;

    private int position = 0;

    public void prepare(List<AttributedPhoneme> script) {
        this.script = script;
    }

    public boolean hasNext() {
        throw new UnsupportedOperationException();
    }

    public AttributedPhoneme next() {
        throw new UnsupportedOperationException();
    }

    public void stop() {
        throw new UnsupportedOperationException();
    }
}
