package Factory;
/**
 * Represents a square shape that implements the Shape interface.
 * This class provides functionality to draw a square.
 *
 * @Author Vrinda
 * @version 1.0
 */
public class Square implements Shape {

	 /**
     * Draws the square.
     * This method prints a message indicating that the square is being drawn.
     */
 @Override
 public void draw() {
     System.out.println("Inside Square::draw() method.");
 }
}
