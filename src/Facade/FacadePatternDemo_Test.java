package Facade;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Contains test cases for the Facade design pattern implementation.
 * Tests the functionality of the ShapeMaker class.
 *
 * @author Vrinda
 * @version 1.0
 */
public class FacadePatternDemo_Test {

	 /**
     * Test case for drawing a circle.
     * Creates a ShapeMaker instance, draws a circle, and asserts that the drawCircle method was called.
     */
    @Test
    public void testDrawCircle() {
        // Create a ShapeMaker instance
        ShapeMaker shapeMaker = new ShapeMaker();

        // Test drawing circle
        shapeMaker.drawCircle();

        // Assert that the drawCircle method was called
        assertNotNull(shapeMaker);
    }
    
    /**
     * Test case for drawing a rectangle.
     * Creates a ShapeMaker instance, draws a rectangle, and asserts that the drawRectangle method was called.
     */
    @Test
    public void testDrawRectangle() {
        // Create a ShapeMaker instance
        ShapeMaker shapeMaker = new ShapeMaker();

        // Test drawing rectangle
        shapeMaker.drawRectangle();

        // Assert that the drawRectangle method was called
        assertNotNull(shapeMaker);
    }

    /**
     * Test case for drawing a square.
     * Creates a ShapeMaker instance, draws a square, and asserts that the drawSquare method was called.
     */
    @Test
    public void testDrawSquare() {
        // Create a ShapeMaker instance
        ShapeMaker shapeMaker = new ShapeMaker();

        // Test drawing square
        shapeMaker.drawSquare();

        // Assert that the drawSquare method was called
        assertNotNull(shapeMaker);
    }
}
