package mal.language.phoneme;

public class Uniphoneme implements Phoneme {
    private String string;

    public Uniphoneme(String string) {
        this.string = string;
    }

    public String toString() {
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Uniphoneme that = (Uniphoneme) o;

        if (string != null ? !string.equals(that.string) : that.string != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return string != null ? string.hashCode() : 0;
    }

    public static Uniphoneme uniphoneme(String string) {
        return new Uniphoneme(string);
    }
}
