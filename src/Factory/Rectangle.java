package Factory;

/**
 * Represents a rectangle shape that implements the Shape interface.
 * This class provides functionality to draw a rectangle.
 *
 * @author Vrinda
 * @version 1.0
 */
public class Rectangle implements Shape {
	
	
    /**
     * Draws the rectangle.
     * This method prints a message indicating that the rectangle is being drawn.
     */
	@Override
	public void draw() {
     System.out.println("Inside Rectangle::draw() method.");
 }
}