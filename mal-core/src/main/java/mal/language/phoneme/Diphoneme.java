package mal.language.phoneme;

public class Diphoneme implements Phoneme {
    private String a;
    private String b;

    public Diphoneme(String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Diphoneme diphoneme = (Diphoneme) o;

        if (a != null ? !a.equals(diphoneme.a) : diphoneme.a != null) return false;
        if (b != null ? !b.equals(diphoneme.b) : diphoneme.b != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (b != null ? b.hashCode() : 0);
        return result;
    }

    public String toString() {
        return a + b;

    }

    public static Diphoneme diphoneme(String a, String b) {
        return new Diphoneme(a, b);
    }
}
