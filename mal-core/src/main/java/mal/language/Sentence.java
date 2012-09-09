package mal.language;

public final class Sentence {
    private String string;

    public Sentence(String string) {
        this.string = string;
    }

    public static Sentence sentence(String string) {
        return new Sentence(string);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sentence sentence = (Sentence) o;

        if (string != null ? !string.equals(sentence.string) : sentence.string != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return string != null ? string.hashCode() : 0;
    }

    public String toString() {
        return string;
    }
}
