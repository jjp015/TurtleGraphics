// @author: Jeremy Park
// @email: jjp015@ucsd.edu
//
// @compile: javac -cp turtleClasses.jar:. TurtleGraphics.java
// @run: java -cp turtleClasses.jar:. TurtleGraphics

import turtleClasses.*;
        import java.awt.Color;

/**
 * The TurtleGraphics class contains variables holding a value that will
 * be used to correctly display letters and numbers on the screen
 */
public class TurtleGraphics extends Turtle {
    private final static int CHAR_WIDTH = 40;
    private final static int CHAR_HEIGHT = 80;
    private final static int PADDING_BETWEEN_CHARS = 40;
    private final static int PADDING_BETWEEN_LINES = 40;
    private final static int CHAR_SPACING = CHAR_WIDTH  + PADDING_BETWEEN_CHARS;
    private final static int LINE_SPACING = CHAR_HEIGHT + PADDING_BETWEEN_LINES;
    private final static int HALF_PADDING_BETWEEN_CHARS =
            PADDING_BETWEEN_CHARS / 2;

    private final static int HALF_CHAR_WIDTH = CHAR_WIDTH / 2;
    private final static int HALF_CHAR_HEIGHT = CHAR_HEIGHT / 2;
    private final static int QUARTER_CHAR_HEIGHT = CHAR_HEIGHT / 4;

    private final static int CHAR_PIX_WIDTH = 30;   // line width for  B and D
    private final static int CHAR_PIX_SPACING = 10; // spacing to form B and D
    private final static int D_CHAR_HEIGHT = 60; // line to create hump of D

    private final static int START_X_1 = 40; // starting x offset for line 1
    private final static int START_X_2 = 40; // starting x offset for line 2
    private final static int START_Y = 40;   // starting y offset

    private final static int PEN_WIDTH = 12;
    private final static Color PEN_COLOR = Color.RED;
    private final static int WORLD_WIDTH = 1080;
    private final static int WORLD_HEIGHT = 480;

    /*
     * Delay between turtle actions (turns, moves) in milliseconds
     * 1000 = 1 sec. so 200 = 0.2 sec.
     */
    private final static int DELAY = 200;

    /**
     * The constructor. Sets up the turtle world.
     */
    private TurtleGraphics(World w, int delay) {
        super(w, delay);
    }

    /**
     * Draw the letter C at position x, y
     * @param x - starting x position
     * @param y - starting y position
     */
    private void drawC(int x, int y) {
        penUp();
        moveTo(x, y); // always start in upper left corner of this char block
        turnToFace(getXPos() + 1, getYPos()); //face right
        penDown();
        forward(CHAR_WIDTH);
        backward(CHAR_WIDTH);
        turnRight();
        forward(CHAR_HEIGHT);
        turnLeft();
        forward(CHAR_WIDTH);
    }

    /**
     * Draw the letter S at position x, y
     * @param x - starting x position
     * @param y - starting y position
     */
    private void drawS(int x, int y) {
        penUp();
        moveTo(x, y); // always start in upper left corner of this char block
        turnToFace(getXPos() + 1, getYPos()); //face right
        penDown();
        forward(CHAR_WIDTH);
        backward(CHAR_WIDTH);
        turnRight();
        forward(HALF_CHAR_HEIGHT);
        turnLeft();
        forward(CHAR_WIDTH);
        turnRight();
        forward(HALF_CHAR_HEIGHT);
        turnRight();
        forward(CHAR_WIDTH);
    }

    /**
     * Draw the letter E at position x, y
     * @param x - starting x position
     * @param y - starting y position
     */
    private void drawE(int x, int y) {
        penUp();
        moveTo(x, y); // always start in upper left corner of this char block
        turnToFace(getXPos() + 1, getYPos()); //face right
        penDown();
        forward(CHAR_WIDTH);
        backward(CHAR_WIDTH);
        turnRight();
        forward(HALF_CHAR_HEIGHT);
        turnLeft();
        forward(CHAR_WIDTH);
        backward(CHAR_WIDTH);
        turnRight();
        forward(HALF_CHAR_HEIGHT);
        turnLeft();
        forward(CHAR_WIDTH);
    }

    /**
     * Draw the letter J at position x, y
     * @param x - starting x position
     * @param y - starting y position
     */
    private void drawJ(int x, int y) {
        penUp();
        moveTo(x, y);
        turnToFace(getXPos() + 1, getYPos());
        penDown();
        forward(CHAR_WIDTH);
        backward(HALF_CHAR_WIDTH);
        turnRight();
        forward(CHAR_HEIGHT);
        turnRight();
        forward(HALF_CHAR_WIDTH);
        turnRight();
        forward(QUARTER_CHAR_HEIGHT);
    }

    /**
     * Draw the letter A at position x, y
     * @param x - starting x position
     * @param y - starting y position
     */
    private void drawA(int x, int y) {
        penUp();
        moveTo(x, y);
        turnToFace(getXPos() + 1, getYPos());
        turnRight();
        penDown();
        forward(CHAR_HEIGHT);
        backward(CHAR_HEIGHT);
        turnLeft();
        forward(CHAR_WIDTH);
        turnRight();
        forward(CHAR_HEIGHT);
        backward(HALF_CHAR_HEIGHT);
        turnRight();
        forward(CHAR_WIDTH);
    }

    /**
     * Draw the letter V at position x, y
     * @param x - starting x position
     * @param y - starting y position
     */
    private void drawV(int x, int y) {
        penUp();
        moveTo(x, y);
        penDown();
        moveTo(getXPos() + HALF_CHAR_WIDTH, getYPos() + CHAR_HEIGHT);
        moveTo(getXPos() + HALF_CHAR_WIDTH, getYPos() -  CHAR_HEIGHT);
    }

    /**
     * Draw the letter U at position x, y
     * @param x - starting x position
     * @param y - starting y position
     */
    private void drawU(int x, int y) {
        penUp();
        moveTo(x, y);
        turnToFace(getXPos() + 1, getYPos());
        turnRight();
        penDown();
        forward(CHAR_HEIGHT);
        turnLeft();
        forward(CHAR_WIDTH);
        turnLeft();
        forward(CHAR_HEIGHT);
    }

    /**
     * Draw the letter N at position x, y
     * @param x - starting x position
     * @param y - starting y position
     */
    private void drawN(int x, int y) {
        penUp();
        moveTo(x, y);
        turnToFace(getXPos() + 1, getYPos());
        turnRight();
        penDown();
        forward(CHAR_HEIGHT);
        backward(CHAR_HEIGHT);
        moveTo(getXPos() + CHAR_WIDTH, getYPos() + CHAR_HEIGHT);
        backward(CHAR_HEIGHT);
    }

    /**
     * Draw the letter D at position x, y
     * @param x - starting x position
     * @param y - starting y position
     */
    private void drawD(int x, int y) {
        penUp();
        moveTo(x, y);
        turnToFace(getXPos() + 1, getYPos());
        penDown();
        forward(CHAR_PIX_WIDTH);
        penUp();
        forward(CHAR_PIX_SPACING);
        turnRight();
        forward(CHAR_PIX_SPACING);
        penDown();
        forward(D_CHAR_HEIGHT);
        penUp();
        forward(CHAR_PIX_SPACING);
        turnRight();
        forward(CHAR_PIX_SPACING);
        penDown();
        forward(CHAR_PIX_WIDTH);
        turnRight();
        forward(CHAR_HEIGHT);
    }

    /**
     * Draw the letter I at position x, y
     * @param x - starting x position
     * @param y - starting y position
     */
    private void drawI(int x, int y) {
        penUp();
        moveTo(x, y); // always start in upper left corner of this char block
        turnToFace(getXPos() + 1, getYPos()); //face right
        backward(HALF_CHAR_WIDTH);
        penDown();
        forward(CHAR_WIDTH);
        backward(HALF_CHAR_WIDTH);
        turnRight();
        forward(CHAR_HEIGHT);
        penUp();
        turnRight();
        forward(HALF_CHAR_WIDTH);
        penDown();
        backward(CHAR_WIDTH);
    }

    /**
     * Draw the letter G at position x, y
     * @param x - starting x position
     * @param y - starting y position
     */
    private void drawG(int x, int y) {
        penUp();
        moveTo(x, y); // always start in upper left corner of this char block
        turnToFace(getXPos() + 1, getYPos()); //face right
        penDown();
        forward(CHAR_WIDTH);
        backward(CHAR_WIDTH);
        turnRight();
        forward(CHAR_HEIGHT);
        turnLeft();
        forward(CHAR_WIDTH);
        turnLeft();
        forward(HALF_CHAR_HEIGHT);
        turnLeft();
        forward(HALF_CHAR_WIDTH);
    }

    /**
     * Draw the letter O at position x, y
     * @param x - starting x position
     * @param y - starting y position
     */
    private void drawO(int x, int y) {
        penUp();
        moveTo(x, y); // always start in upper left corner of this char block
        turnToFace(getXPos() + 1, getYPos()); //face right
        penDown();
        forward(CHAR_WIDTH);
        turnRight();
        forward(CHAR_HEIGHT);
        turnRight();
        forward(CHAR_WIDTH);
        turnRight();
        forward(CHAR_HEIGHT);
    }

    /**
     * The main method starts at program execution and calls methods
     * in this class to draw letters as required in the assignment
     */
    public static void main(String[] args) {
        int x, y;

        World w = new World(WORLD_WIDTH, WORLD_HEIGHT);
        TurtleGraphics myTurtle = new TurtleGraphics(w, DELAY);

        myTurtle.setPenWidth(PEN_WIDTH);
        myTurtle.setPenColor(PEN_COLOR);

        // CHAR_SPACING will move starting point over for the next character
        // HALF_PADDING_BETWEEN_CHARS and PADDING BETWEEN_CHARS will optimize
        // for more or less spacing

        // Line1: JAVA
        x = START_X_1; // starting point for x
        y = START_Y;  // starting point for y

        myTurtle.drawJ(x, y);

        x += CHAR_SPACING;
        myTurtle.drawA(x, y);

        x += CHAR_SPACING;
        myTurtle.drawV(x, y);

        x += CHAR_SPACING;
        myTurtle.drawA(x, y);

        // Line 2: UC SAN DIEGO
        x = START_X_2;
        y = y + LINE_SPACING;
        myTurtle.drawU(x, y);

        x += CHAR_SPACING;
        myTurtle.drawC(x, y);

        x += CHAR_SPACING + PADDING_BETWEEN_CHARS;
        myTurtle.drawS(x, y);

        x += CHAR_SPACING;
        myTurtle.drawA(x, y);

        x+= CHAR_SPACING;
        myTurtle.drawN(x, y);

        x += CHAR_SPACING + PADDING_BETWEEN_CHARS;
        myTurtle.drawD(x, y);

        x += CHAR_SPACING + HALF_PADDING_BETWEEN_CHARS;
        myTurtle.drawI(x, y);

        x += CHAR_SPACING - HALF_PADDING_BETWEEN_CHARS;
        myTurtle.drawE(x, y);

        x += CHAR_SPACING;
        myTurtle.drawG(x, y);

        x += CHAR_SPACING;
        myTurtle.drawO(x, y);
    }
}
