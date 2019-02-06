/* BullsEye.java
 * Author:  William Craycroft
 * Module:  1
 * Project: Project 3-1
 * Problem Statement: This class draws a red and white bulls-eye using Java's Graphics class.
 *
 * Algorithm / Plan:
 *      1. Instantiate new JFrame of size 320 x 340
 *      2. Define constants for outer circle dimensions and number of circles
 *      3. Calculate x/y offset for each circle using initial circle's width / (number of circles * 2)
 *      4. For each circle:
 *          If index is odd, set color to white, else red.
 *          Draw circle increasing initial circle x/y values by offset * index
 *          and decreasing circle height and width by 2 * offset * index.
 */

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

@SuppressWarnings("serial")

public class BullsEye extends JFrame {

    public static final String TITLE = "Bulls-eye";
    public static final int WIDTH = 320, HEIGHT = 340;
    public static final int SHAPE_WIDTH = 300;
    public static final int SHAPE_HEIGHT = 300;
    public static final int X_VALUE = 10;
    public static final int Y_VALUE = 30;
    public static final int NUM_CIRCLES = 6;
    public static final int OFFSET = SHAPE_WIDTH / (NUM_CIRCLES * 2);

    public void paint(Graphics canvas) {

        for (int i = 0; i < NUM_CIRCLES; i++) {
            // If odd index, set color to white, else red
            canvas.setColor((i % 2 == 0) ? Color.RED : Color.WHITE);
            // Draw circle
            canvas.fillOval(X_VALUE + (OFFSET * i), Y_VALUE + (OFFSET * i), SHAPE_WIDTH - (OFFSET * i * 2),
                    SHAPE_HEIGHT - (OFFSET * i * 2));
        }
    }

    public static void main (String args[]) {
        JFrame face = new BullsEye();
        face.setSize(WIDTH, HEIGHT);
        face.setTitle(TITLE);
        face.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        face.setLocationRelativeTo(null);
        face.setVisible(true);
    }
}