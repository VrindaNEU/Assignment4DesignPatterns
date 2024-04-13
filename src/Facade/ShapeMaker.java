package Facade;

/**
 * Represents a shape maker that provides a simplified interface for drawing various shapes.
 * This class encapsulates the creation and drawing of circle, rectangle, and square shapes.
 * It uses the Facade design pattern to provide a unified interface to draw different shapes.
 *
 * The ShapeMaker class does not receive any parameters in its methods.
 * Each method, such as drawCircle(), drawRectangle(), and drawSquare(), internally invokes
 * the draw() method of the respective shape object to draw the shape.
 * 
 * All methods of the ShapeMaker class return void, as they are responsible for drawing shapes
 * and do not produce any explicit output or result other than drawing the shapes on the screen.
 * 
 * @author Vrinda
 * @version 1.0
 */

public class ShapeMaker {
	
 private Shape circle;      // Instance of Circle shape
 private Shape rectangle;   // Instance of Rectangle shape
 private Shape square;      // Instance of Square shape

 /**
  * Constructs a new ShapeMaker object.
  * Initializes instances of Circle, Rectangle, and Square shapes.
  */
 public ShapeMaker() {
     circle = new Circle();
     rectangle = new Rectangle();
     square = new Square();
 }
 
 /**
  * Draws a circle shape.
  * Invokes the draw() method of the Circle object to draw the circle shape.
  */
 public void drawCircle() {
     circle.draw();
 }

 /**
  * Draws a rectangle shape.
  * Invokes the draw() method of the Rectangle object to draw the rectangle shape.
  */
 public void drawRectangle() {
     rectangle.draw();
 }

 /**
  * Draws a square shape.
  * Invokes the draw() method of the Square object to draw the square shape.
  */
 public void drawSquare() {
     square.draw();
 }
 
}
