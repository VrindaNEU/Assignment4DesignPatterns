package StateMoonRover;

/**
 * Represents the state of a moon rover when it is at rest.
 * Implements the State interface.
 * Handles pedal presses to transition the rover to acceleration states.
 * Prints messages for state transitions and non-changing actions.
 *
 * @author Vrinda
 * @version 1.0
 */
public class AtRest implements State{

    /**
     * Handles a single press of the left pedal, transitioning to ForwardAcceleration.
     *
     * @param context the current rover state context
     */
	@Override
	public void pressLeftPedalOnce(Context context) {
		context.setState(new ForwardAcceleration());
		System.out.println("Forward Acceleration Started");
	}

	 /**
     * Handles a single press of the right pedal without state change.
     *
     * @param context the current rover state context
     */
	@Override
	public void pressRightPedalOnce(Context context) {
		System.out.println("This action does not make any change at this state");
		
	}

	 /**
     * Handles holding the left pedal for more than three seconds, transitioning to BackwardAcceleration.
     *
     * @param context the current rover state context
     */
	@Override
	public void pressLeftPedalMoreThanThreeSeconds(Context context) {
		context.setState(new BackwardAcceleration());
		System.out.println("Backward Acceleration Started");
		
	}

	 /**
     * Handles holding the right pedal for more than three seconds without state change.
     *
     * @param context the current rover state context
     */
	@Override
	public void pressRightPedalMoreThanThreeSeconds(Context context) {
		System.out.println("This action does not make any change at this state");
		
	}

}
