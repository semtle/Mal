package mal.speak;

import mal.language.phone.attribute.AttributedPhonemeSequence;
import mal.language.phone.attribute.AttributedPhone;


public class Prompter {
    private AttributedPhonemeSequence script;

    private int position = 0;

    public void prepare(AttributedPhonemeSequence script) {
        this.script = script;
    }

    public boolean hasNext() {
        throw new UnsupportedOperationException();
    }

    public AttributedPhone next() {
        throw new UnsupportedOperationException();
    }

    public void stop() {
        throw new UnsupportedOperationException();
    }
}