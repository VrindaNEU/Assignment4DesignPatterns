package Factory;

/**
 * Demonstrates the use of the Factory design pattern.
 * This class contains the main method to execute the demonstration.
 *
 * @author Vrinda
 * @version 1.0
 */
public class FactoryPatternDemo {
	
    /**
     * The main method to execute the demonstration of the Factory pattern.
     * It creates an instance of ShapeFactory and uses it to create instances of Circle, Rectangle, and Square shapes.
     * Then, it calls the draw method on each shape to visualize their drawing.
     *
     * @param args command-line arguments 
     */
 public static void main(String[] args) {
     ShapeFactory shapeFactory = new ShapeFactory();

     // Get an object of Circle and call its draw method.
     Shape shape1 = shapeFactory.getShape("CIRCLE");
     shape1.draw();

     // Get an object of Rectangle and call its draw method.
     Shape shape2 = shapeFactory.getShape("RECTANGLE");
     shape2.draw();

     // Get an object of Square and call its draw method.
     Shape shape3 = shapeFactory.getShape("SQUARE");
     shape3.draw();
 }
}
