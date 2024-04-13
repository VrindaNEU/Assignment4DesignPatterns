package StateMoonRover;

/**
 * Demonstrates the state transitions of a moon rover.
 * Simulates various actions such as pedal presses to transition the rover between different states.
 * Prints messages indicating the state transitions and actions performed.
 * This class provides an example usage of the state pattern with a moon rover context.
 * 
 * @author Vrinda
 * @version 1.0
 */
public class MoonRoverDemo {

	 /**
     * The main method to execute the demonstration of moon rover state transitions.
     * Creates a Context instance and performs various actions to transition the rover between different states.
     *
     * @param args the command-line arguments (not used)
     */
	public static void main(String[] args) {
		
		Context context = new Context();
		
		AtRest atRest = new AtRest();
		atRest.pressLeftPedalOnce(context); // Forward Acceleration
		
		ForwardAcceleration forwardAcceleration = new ForwardAcceleration();
		forwardAcceleration.pressRightPedalMoreThanThreeSeconds(context); // Constant Forward Speed

		ConstantForwardSpeed constantForwardSpeed = new ConstantForwardSpeed();
		constantForwardSpeed.pressRightPedalOnce(context); // At Rest
		
		atRest.pressLeftPedalMoreThanThreeSeconds(context); // Backward Acceleration
		
		BackwardAcceleration backwardAcceleration = new BackwardAcceleration();
		backwardAcceleration.pressRightPedalMoreThanThreeSeconds(context); // Constant Backward Speed
		
		ConstantBackwardSpeed constantBackwardSpeed = new ConstantBackwardSpeed();
		constantBackwardSpeed.pressRightPedalOnce(context); // At Rest
		
		
		
	}

}
