package Factory;

/**
 * Represents a circle shape that implements the Shape interface.
 *
 * @author Vrinda
 * @version 1.0
 */
public class Circle implements Shape {

	 /**
     * Draws the circle.
     * This method prints a message indicating that the circle is being drawn.
     */	
	@Override
	public void draw() {
     System.out.println("Inside Circle::draw() method.");
 }
}
