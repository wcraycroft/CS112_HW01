/* ParallelIllusion.java
 * Author:  William Craycroft
 * Module:  1
 * Project: Project 3-3
 * Problem Statement: This class draws an optical illusion consisting of 7 rows of alternating black and white rectangles,
 *                    horizontally separated by light grey lines and vertically offset in an oscillating pattern.
 *
 * Algorithm / Plan:
 *      1. Instantiate new JFrame of size 640 x 450
 *      2. Define constants for rectangle dimensions, divider and padding size, and number of rows and cols
 *      3. For each row:
 *              Calculate offset using triangle wave function
  *             Calculate y coordinate value
 *              For every other column:
 *                  Calculate x coordinate value.
 *                  Use x and y to draw a dark gray Rectangle and a black rectangle, offset by padding value
 *              Draw one divider at the bottom of each row, separating them
 */

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

@SuppressWarnings("serial")

public class ParallelIllusion extends JFrame {

    public static final String TITLE = "Parallel Illusion";
    public static final int WIDTH = 640, HEIGHT = 450;
    public static final int RECT_HEIGHT = 60;
    public static final int RECT_WIDTH = 40;
    public static final int X_VALUE = 20;
    public static final int Y_VALUE = 20;
    public static final int DIVIDER_HEIGHT = 3;
    public static final int PADDING = 2;
    public static final int ROWS = 7;
    public static final int COLS = 16;

    public void paint(Graphics canvas) {

        int offset, x, y;
        // Loop through rows
        for (int row = 0; row < ROWS; row++) {

            // Determine offset at current row using triangle wave function (will return 1, 0 or -1)
            offset = Math.abs((row % 4) - 2) - 1;
            // Calculate starting y value for squares since it won't change in col loop
            y = Y_VALUE + (row * (RECT_HEIGHT + DIVIDER_HEIGHT));

            // Loop through black squares
            for (int col = 0; col < COLS / 2; col++) {
                // Determine x starting values for black square
                x = X_VALUE + (col * RECT_WIDTH * 2) + (offset * (RECT_WIDTH / 3));
                // Draw dark grey outline square
                canvas.setColor(Color.DARK_GRAY);
                canvas.fillRect(x - PADDING,y - PADDING, RECT_WIDTH + (PADDING * 2),
                        RECT_HEIGHT + (PADDING * 2));
                // Draw black square
                canvas.setColor(Color.BLACK);
                canvas.fillRect(x, y, RECT_WIDTH, RECT_HEIGHT);
            }
            // Between each row, draw dark grey divider (rectangle)
            canvas.setColor(Color.DARK_GRAY);
            canvas.fillRect(0, y + RECT_HEIGHT, WIDTH, DIVIDER_HEIGHT);
        }
    }

    public static void main (String args[]) {
        JFrame face = new ParallelIllusion();
        face.setSize(WIDTH, HEIGHT);
        face.setTitle(TITLE);
        face.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        face.setLocationRelativeTo(null);
        face.setVisible(true);
    }
}