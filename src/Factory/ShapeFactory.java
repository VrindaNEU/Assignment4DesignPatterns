package Factory;

/**
 * Factory class for creating instances of different shapes.
 * This class provides a method to get a specific shape based on a given shape type.
 *
 * @author Vrinda
 * @version 1.0
 */
public class ShapeFactory {
 
    /**
     * Gets a specific shape based on the given shape type.
     *
     * @param shapeType a String representing the type of shape to create (e.g., "CIRCLE", "RECTANGLE", "SQUARE")
     * @return a Shape object representing the requested shape, or null if the shape type is not recognized
     */
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
	}

