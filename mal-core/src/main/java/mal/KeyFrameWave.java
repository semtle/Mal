package mal;

import java.util.SortedMap;
import java.util.TreeMap;


/**
 * A {@code KeyFrameWave} represents a wave that is based on some key frames.
 */
public class KeyFrameWave implements Wave {
    private SortedMap<Float, Float> keyFrames = new TreeMap<Float, Float>();

    @Override
    public float value(float time) {
        KeyFrame earlierKeyFrame = getEarlierKeyFrame(time);
        KeyFrame laterOrExactKeyFrame = getLaterOrExactKeyFrame(time);
        if (earlierKeyFrame == null && laterOrExactKeyFrame == null) {
            throw new IllegalStateException();
        }
        if (earlierKeyFrame == null) {
            return earlierKeyFrame.value();
        }
        if (laterOrExactKeyFrame == null) {
            return laterOrExactKeyFrame.value();
        }

        float elapsedTime = time - earlierKeyFrame.time();
        float remainingTime = laterOrExactKeyFrame.time() - time;
        float earlierValueRatio = remainingTime / (elapsedTime + remainingTime);
        float laterOrExactValueRatio = elapsedTime / (elapsedTime + remainingTime);

        return earlierValueRatio * earlierKeyFrame.value() + laterOrExactValueRatio
                * laterOrExactKeyFrame.value();
    }

    private KeyFrame getLaterOrExactKeyFrame(float time) {
        throw new UnsupportedOperationException();
    }

    private KeyFrame getEarlierKeyFrame(float time) {
        throw new UnsupportedOperationException();
    }

    public void set(float time, float value) {
        keyFrames.put(time, value);
    }

    private static class KeyFrame {
        private float time;
        private float value;

        KeyFrame(float time, float value) {
            this.time = time;
            this.value = value;
        }

        float time() {
            return time;
        }

        float value() {
            return value;
        }
    }
}
