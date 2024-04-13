package Singleton;

/**
 * Demonstrates the use of the Singleton design pattern.
 * This class contains the main method to execute the demonstration.
 * It creates an instance of SingleObject using the getInstance() method and calls its showMessage() method.
 *
 * @author Vrinda
 * @version 1.0
 */
public class SingletonPatternDemo {
	
	/**
     * The main method to execute the demonstration of the Singleton pattern.
     * It creates an instance of SingleObject using the getInstance() method and calls its showMessage() method.
     *
     * @param args command-line arguments 
     */
	 public static void main(String[] args) {
        
        SingleObject object = SingleObject.getInstance();

        
        object.showMessage();
    }

}
