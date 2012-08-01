package mal;

/**
 * A {@code Wave} represents an abstract continuous series of values by a relative time between 0
 * and 1.
 */
public interface Wave {
    /**
     * Returns a value in a relative.
     *
     * @param time A relative time between 0~1.
     * @return a float value
     */
    float value(float time);
}
