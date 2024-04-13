package StateMoonRover;

/**
 * Represents the state of a moon rover when it is accelerating backward.
 * Implements the State interface.
 * Handles pedal presses to transition the rover to different states.
 * Prints messages for state transitions and non-changing actions.
 *
 * @author Vrinda
 * @version 1.0
 */
public class BackwardAcceleration implements State{

	 /**
     * Handles a single press of the left pedal without state change.
     *
     * @param context the current rover state context
     */
	@Override
	public void pressLeftPedalOnce(Context context) {
		System.out.println("This action does not make any change at this state");

		
	}

	 /**
     * Handles a single press of the right pedal, transitioning to AtRest state.
     *
     * @param context the current rover state context
     */
	@Override
	public void pressRightPedalOnce(Context context) {
		context.setState(new AtRest());
		System.out.println("Slows down to a Resting Position");
	}

	 /**
     * Handles holding the left pedal for more than three seconds without state change.
     *
     * @param context the current rover state context
     */
	@Override
	public void pressLeftPedalMoreThanThreeSeconds(Context context) {
		System.out.println("This action does not make any change at this state");

		
	}

	
	 /**
     * Handles holding the right pedal for more than three seconds, transitioning to ConstantBackwardSpeed state.
     *
     * @param context the current rover state context
     */
	@Override
	public void pressRightPedalMoreThanThreeSeconds(Context context) {
		context.setState(new ConstantBackwardSpeed());
		System.out.println("Moves with Constant Backward Speed");
		
	}

}
