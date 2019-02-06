/* CircleInSquare.java
 * Author:  William Craycroft
 * Module:  1
 * Project: Project 2
 * Problem Statement: This class draws a yellow circle inside a blue square using Java's Graphics class.
 *
 * Algorithm / Plan:
 *      1. Instantiate new JFrame of size 320 x 340
 *      2. Set color to Blue
 *      3. Draw rectangle, originating at (10, 30), with height and width of 300
 *      4. Set color to Yellow
 *      5. Draw oval, originating at (10, 30), with diameter of 300
 */

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

@SuppressWarnings("serial")

public class CircleInSquare extends JFrame {

    public static final String TITLE = "Circle in Square";
    public static final int WIDTH = 320, HEIGHT = 340;
    public static final int SHAPE_WIDTH = 300;
    public static final int SHAPE_HEIGHT = 300;
    public static final int X_VALUE = 10;
    public static final int Y_VALUE = 30;

    public void paint(Graphics canvas) {

        // Draw square
        canvas.setColor(Color.BLUE);
        canvas.fillRect(X_VALUE, Y_VALUE, SHAPE_WIDTH, SHAPE_HEIGHT);
        // Draw circle
        canvas.setColor(Color.YELLOW);
        canvas.fillOval(X_VALUE,Y_VALUE, SHAPE_WIDTH, SHAPE_HEIGHT);
    }

    public static void main (String args[]) {
        JFrame face = new CircleInSquare();
        face.setSize(WIDTH, HEIGHT);
        face.setTitle(TITLE);
        face.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        face.setLocationRelativeTo(null);
        face.setVisible(true);
    }
}