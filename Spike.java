/**
 * This class represents a Spike in the Balloon Game.
 *
 * @author Tony Tran
 * @version 1.0
 * @since 2025-05-06
 */
public class Spike {
    /**
     * The horizontal position of the Spike.
     */
    private int xSpace;
    /**
     * The vertical position of the Spike.
     */
    public static final int YPOSITION = 0;
    /**
     * Constructor for the Spike class.
     *
     * @param xPosition The initial horizontal position of the Spike.
     */
    public Spike(final int xPosition) {
        this.xSpace = xPosition;
    }
    /**
     * Gets the horizontal position of the Spike.
     *
     * @return The horizontal position of the Spike.
     */
    public int getXSpace() {
        return this.xSpace;
    }
    /**
     * Pops the specified Balloon.
     *
     * @param balloon The Balloon to be popped.
     */
    public void popBalloon(final Balloon balloon) {
        balloon.popped();
    }
    /**
     * Moves the Spike horizontally by a specified number of spaces.
     *
     * @param xSpaces The number of spaces to move the Spike horizontally.
     */
    public void moveSpikeHorizontal(final int xSpaces) {
        this.xSpace += xSpaces;
    }
}
