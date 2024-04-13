package Factory;

/**
 * Represents a generic shape interface.
 * Classes implementing this interface must provide functionality to draw the shape.
 *
 * @author Vrinda
 * @version 1.0
 */
public interface Shape {

	 /**
     * Draws the shape.
     * This method should be implemented by concrete shape classes to provide drawing functionality.
     */
 void draw();
}