package Singleton;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Contains a test case for the Singleton design pattern implementation.
 * Tests the behavior of the SingleObject class as a singleton.
 *
 * @author Vrinda
 * @version 1.0
 */
public class SingletonPatternDemo_Test {
	
    /**
     * Test case to verify that only one instance of SingleObject is created.
     * Creates two instances of SingleObject using the getInstance() method and checks if they are the same instance.
     */
    @Test
    public void testSingletonInstance() {
        SingleObject instance1 = SingleObject.getInstance();
        SingleObject instance2 = SingleObject.getInstance();

        // Check if both instances are the same
        assertSame(instance1, instance2);
    }
}
