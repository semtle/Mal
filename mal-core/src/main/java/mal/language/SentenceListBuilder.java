package mal.language;

import java.util.ArrayList;
import java.util.List;

public class SentenceListBuilder {
    private StringBuilder stringBuilder = new StringBuilder();
    private String regex;

    public SentenceListBuilder() {
        this("\\p{Punct}");
    }

    public SentenceListBuilder(String regex) {
        this.regex = regex;
    }

    public SentenceListBuilder append(String string) {
        stringBuilder.append(string);
        return this;
    }

    public List<Sentence> build() {
        String string = stringBuilder.toString();
        List<Sentence> sentences = new ArrayList<Sentence>();
        for (String splitString : string.split(regex)) {
            String trimmed = splitString.trim();
            sentences.add(Sentence.sentence(trimmed));
        }
        return sentences;
    }
}
