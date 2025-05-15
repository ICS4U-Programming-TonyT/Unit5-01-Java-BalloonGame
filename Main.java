import java.awt.Color;
/**
 * This is a utility class that serves as a placeholder for the main method.
 * @author Tony Tran
 * @version 1.0
 * @since 2025-05-06
 */

final class Main {
    /**
     * This is a private constructor to satisfy style checker.
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Main() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * The main method that serves as the entry point for the program.
     * @param args Command line arguments.
     */
    public static void main(final String[] args) {
        Balloon balloon = new Balloon(100, 200, Color.RED, 1);
        Spike spike = new Spike(150);
        System.out.println("Starting Stats:");
        System.out.println("    Balloon Position: ("
         + balloon.getXSpace() + ", " + balloon.getYSpace() + ")");
        System.out.println("    Spike Position: ("
         + spike.getXSpace() + ", " + Spike.YPOSITION + ")");
        System.out.println("    Balloon Color: "
         + balloon.getColor());
        System.out.println("    Balloon Popped: "
         + balloon.getPop());
        System.out.println("    Balloon ID: "
         + balloon.getid());
        System.out.println("    Spike ID: "
         + spike.getXSpace());
        System.out.println("    Spike Y Position: "
         + Spike.YPOSITION);
        System.out.println("Moving Balloon...");
        balloon.moveBalloon(150, 200);
        System.out.println("    Balloon Position: ("
         + balloon.getXSpace() + ", " + balloon.getYSpace() + ")");
        System.out.println("Moving Spike...");
        spike.moveSpikeHorizontal(150);
        System.out.println("    Spike Position: ("
         + spike.getXSpace() + ", " + Spike.YPOSITION + ")");
        System.out.println("Popping Balloon...");
        spike.popBalloon(balloon);
        System.out.println("    Balloon Popped: "
         + balloon.getPop());
    }
}
