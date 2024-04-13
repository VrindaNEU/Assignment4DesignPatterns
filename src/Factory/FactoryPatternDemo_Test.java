package Factory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Contains test cases for the Factory design pattern implementation.
 * Tests the functionality of the ShapeFactory class.
 *
 * @author Vrinda
 * @version 1.0
 */
public class FactoryPatternDemo_Test {

	 /**
     * Test case for creating a circle shape.
     * Creates a ShapeFactory instance, requests a circle shape, and asserts that the returned shape is an instance of Circle.
     */
    @Test
    public void testCreateCircle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    /**
     * Test case for creating a rectangle shape.
     * Creates a ShapeFactory instance, requests a rectangle shape, and asserts that the returned shape is an instance of Rectangle.
     */
    @Test
    public void testCreateRectangle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }
    
    
    /**
     * Test case for creating a square shape.
     * Creates a ShapeFactory instance, requests a square shape, and asserts that the returned shape is an instance of Square.
     */
    @Test
    public void testCreateSquare() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = shapeFactory.getShape("SQUARE");
        assertNotNull(square);
        assertTrue(square instanceof Square);
    }
}