package Singleton;


/**
 * Represents a singleton object.
 * This class ensures that only one instance of SingleObject is created and provides a global point of access to that instance.
 * It also provides a method to show a message.
 *
 * @author Vrinda
 * @version 1.0
 */

public class SingleObject {
	
	
	// The single instance of SingleObject
    private static SingleObject instance = new SingleObject();

    
  // Private constructor to prevent instantiation from outside
    private SingleObject(){}

    
    /**
     * Gets the single instance of SingleObject.
     *
     * @return the single instance of SingleObject
     */
    public static SingleObject getInstance(){
        return instance;
    }

    /**
     * Shows a message.
     * This method prints "Hello World!" to the console.
     */
    public void showMessage() {
        System.out.println("Hello World!");
    }

}
