package mal.language;

import junit.framework.Assert;
import mal.language.phoneme.Phoneme;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static mal.language.Sentence.sentence;
import static mal.language.phoneme.Diphoneme.diphoneme;
import static mal.language.phoneme.PausePhoneme.shortPausePhoneme;
import static mal.language.phoneme.Uniphoneme.uniphoneme;

public class SomeTest {

    private List<Phoneme> toPhonemeList(String string) {
        List<Phoneme> phonemes = new ArrayList<Phoneme>();
        for (char c : string.toCharArray()) {
            phonemes.add(toPhoneme(c));
        }
        return phonemes;
    }

    private Phoneme toPhoneme(char c) {
        switch (c) {
            case '동':
                return diphoneme("도", "옹");
            case '해':
                return uniphoneme("해");
            case ' ':
                return shortPausePhoneme();
            case '물':
                return diphoneme("무", "울");
            case '과':
                return uniphoneme("과");
            case '백':
                return diphoneme("배", "액");
            case '뚜':
                return uniphoneme("뚜");
            case '사':
                return uniphoneme("사");
            case '니':
                return uniphoneme("니");
        }
        return null;
    }

    private Sentence toSpoken(Sentence sentence) {
        String string = sentence.toString();
        string = string.replace("백두", "백뚜");
        string = string.replace("산이", "사니");
        string = string.replace("닳도", "달토");
        string = string.replace("님이", "니미");
        return sentence(string);
    }

    @Test
    public void testSplitSentences() {
        List<Sentence> expected = Arrays.asList(sentence("우리나라 만세"), sentence("무궁화 삼천리"));
        Assert.assertEquals(expected, new SentenceListBuilder().append("우리나라 만세. 무궁화 삼천리.").build());
    }

    @Test
    public void testToSpoken() {
        Sentence expected = sentence("동해 물과 백뚜사니 마르고 달토록 하느니미 보우하사 우리나라 만세");
        Sentence toSpoken = toSpoken(sentence("동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세"));
        Assert.assertEquals(expected, toSpoken);
    }

    @Test
    public void testToPhonemeList() {
        List<Phoneme> expected = Arrays.asList(diphoneme("도", "옹"), uniphoneme("해"), shortPausePhoneme(),
                diphoneme("무", "울"), uniphoneme("과"), shortPausePhoneme(),
                diphoneme("배", "액"), uniphoneme("뚜"), uniphoneme("사"), uniphoneme("니"));
        Assert.assertEquals(expected, toPhonemeList("동해 물과 백뚜사니"));
    }
}
