package mal;

import java.util.List;


/**
 * A {@code Speaker} speaks a text in a voice.
 */
public class Speaker {
    private Prompter prompter;

    private Voice voice;

    private Analyzer analyzer;

    private AudioPlayer audioPlayer;

    private AttributedPhone currentAttributedPhone;

    public void speak(String text) {
        List<AttributedPhone> analyzed = analyzer.analyze(text);
        prompter.prepare(analyzed);
        while (prompter.hasNext()) {
            currentAttributedPhone = prompter.next();
            audioPlayer.playAndWait(currentAttributedPhone);
        }
    }

    public void stop() {
        prompter.stop();
        audioPlayer.stop();
    }

    public void setVolume(float volume) {
        audioPlayer.setVolume(volume);
    }

    public float getVolume() {
        return audioPlayer.getVolume();
    }

    public void setVoice() {
        throw new UnsupportedOperationException();
    }

    public void setSpeed(float speed) {
        audioPlayer.setSpeed(speed);
    }

    public float getSpeed() {
        return audioPlayer.getSpeed();
    }
}
