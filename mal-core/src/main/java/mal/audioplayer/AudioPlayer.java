package mal.audioplayer;

import mal.language.phone.attribute.AttributedPhone;

/**
 * A {@code AudioPlayer} plays a sound. It has a playback, volume, speed control.
 */
public interface AudioPlayer {
    void playAndWait(AttributedPhone attributedPhone);

    void stop();

    void setVolume(float volume);

    float getVolume();

    void setSpeed(float speed);

    float getSpeed();
}
