import java.awt.Color;
/**
 *This class represents a Balloon in the Balloon Game.
 *
 * @author Tony Tran
 * @version 1.0
 * @since 2025-05-06
*/

public class Balloon {
    /**
     * The horizontal position of the Balloon.
     */
    private int xSpace;
    /**
     * The vertical position of the Balloon.
     */
    private int ySpace;
    /**
     * The color of the Balloon.
     */
    private Color color;
    /**
     * Indicates whether the Balloon has been popped.
     */
    private boolean popped;
    /**
     * The ID of the Balloon.
     */
    private int id;
    /**
     * Constructor for the Balloon class.
     *
     * @param xSpaces The initial horizontal position of the Balloon.
     * @param ySpaces The initial vertical position of the Balloon.
     * @param colors  The color of the Balloon.
     * @param ids     The ID of the Balloon.
     */
    public Balloon(final int xSpaces, final int ySpaces,
            final Color colors, final int ids) {
        this.xSpace = xSpaces;
        this.ySpace = ySpaces;
        this.color = colors;
        this.popped = false;
        this.id = ids;
    }
    /**
     * @return Pops the Balloon.
     */
    public boolean getPop() {
        return this.popped;
    }
    /**
     * @return Pops the Balloon.
     */
    public boolean popped() {
        this.popped = true;
        return this.popped;
    }
    /**
     * @return Identifies the Balloon.
     */
    public int getid() {
        return this.id;
    }
    /**
     * Gets the horizontal position of the Balloon.
     * @return The horizontal position of the Balloon.
     */
    public int getXSpace() {
        return this.xSpace;
    }
    /**
     * @return The color of the Balloon.
     */
    public Color getColor() {
        return this.color;
    }
    /**
     * Gets the vertical position of the Balloon.
     * @return The vertical position of the Balloon.
     */
    public int getYSpace() {
        return this.ySpace;
    }
    /**
     * Moves the Ballon.
     * @param xSpaces
     * @param ySpaces
     */
    public void moveBalloon(final int xSpaces, final int ySpaces) {
        this.xSpace += xSpaces;
        this.ySpace += ySpaces;
    }
    /**
     * Changes the color of the Balloon.
     * @param colors The new color of the Balloon.
     */
    public void changeColor(final Color colors) {
        this.color = colors;
    }
 }
