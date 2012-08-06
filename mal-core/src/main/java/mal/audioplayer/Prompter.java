package mal.audioplayer;

import mal.language.phoneme.AttributedPhonemeSequence;
import mal.language.voice.AttributedPhone;

import java.util.ArrayList;
import java.util.List;


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
