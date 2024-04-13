package Facade;

/**
 * Represents a shape that can be drawn.
 * Implementing classes must provide functionality to draw the shape.
 * This interface defines a single method, draw(), which is responsible for drawing the shape.
 *
 * @author Vrinda
 * @version 1.0
 */
public interface Shape {
	/**
	 * Draws the shape.
	 * Implementing classes should provide their specific implementation of this method
	 * to draw the corresponding shape.
	 */
	void draw();

}
