/* CrescentMoon.java
 * Author:  William Craycroft
 * Module:  1
 * Project: Project 3-2
 * Problem Statement: This class draws a crescent moon using a filled oval and two filled arcs
 *
 * Algorithm / Plan:
 *      1. Instantiate new JFrame of size 320 x 340
 *      2. Define constants for full moon dimensions
 *      3. Set color to Blue, draw 320 x 340 rectangle for background
 *      4. Set color to Yellow, draw oval using constant dimensions
 *      5. Set color to Dark Grey
 *      6. Draw first filled  arc, at 180 degrees, with width of 60 and initial x value at -60 from moon's center
 *      7. Draw second filled arc, at -180 degrees, with dimensions and x/y coordinates matching initial moon values
 */

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

@SuppressWarnings("serial")

public class CrescentMoon extends JFrame {

    public static final String TITLE = "Crescent Moon";
    public static final int WIDTH = 320, HEIGHT = 340;
    public static final int SHAPE_WIDTH = 200;
    public static final int SHAPE_HEIGHT = 200;
    public static final int X_VALUE = 55;
    public static final int Y_VALUE = 75;

    public void paint(Graphics canvas) {

        // Draw background
        canvas.setColor(Color.BLUE);
        canvas.fillRect(0, 0, WIDTH, HEIGHT);
        // Draw lit moon
        canvas.setColor(Color.YELLOW);
        canvas.fillOval(X_VALUE, Y_VALUE, SHAPE_WIDTH, SHAPE_HEIGHT);
        // Draw first dark crescent (left)
        canvas.setColor(Color.DARK_GRAY);
        canvas.fillArc(X_VALUE + (SHAPE_WIDTH / 2) - 60 , Y_VALUE, SHAPE_WIDTH - 60, SHAPE_HEIGHT, 90, 180);
        // Draw second dark crescent (fill)
        canvas.fillArc(X_VALUE, Y_VALUE, SHAPE_WIDTH, SHAPE_HEIGHT, 90, -180);


    }

    public static void main (String args[]) {
        JFrame face = new CrescentMoon();
        face.setSize(WIDTH, HEIGHT);
        face.setTitle(TITLE);
        face.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        face.setLocationRelativeTo(null);
        face.setVisible(true);
    }
}