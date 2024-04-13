package Facade;

/**
 * Demonstrates the use of the Facade design pattern.
 * This class contains the main method to execute the demonstration.
 *
 * @author Vrinda
 * @version 1.0
 */

public class FacadePatternDemo {
	
	 /**
     * The main method to execute the demonstration of the Facade pattern.
     * It creates an instance of ShapeMaker and uses it to draw a circle, rectangle, and square.
     *
     * @param args command-line arguments
     */
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
		}
	}
