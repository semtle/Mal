package mal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Teddy Choi
 */
class Prompter {
    private List<AttributedPhone> script;

    private int position = 0;

    public void prepare(List<AttributedPhone> script) {
        this.script = new ArrayList<AttributedPhone>(script);
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
