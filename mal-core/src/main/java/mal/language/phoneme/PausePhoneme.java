package mal.language.phoneme;

public class PausePhoneme implements Phoneme {
    private final static PausePhoneme SHORT = new PausePhoneme("  ");
    private final static PausePhoneme LONG = new PausePhoneme("  ");

    private String string;

    private PausePhoneme(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PausePhoneme that = (PausePhoneme) o;

        if (string != null ? !string.equals(that.string) : that.string != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return string != null ? string.hashCode() : 0;
    }

    public String toString() {
        return string;
    }

    public static PausePhoneme longPausePhoneme() {
        return LONG;
    }

    public static PausePhoneme shortPausePhoneme() {
        return SHORT;
    }
}
