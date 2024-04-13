package StateMoonRover;

/**
 * Represents the state of a moon rover.
 * Defines methods to handle different pedal presses to transition the rover between states.
 * Each method corresponds to a specific pedal press action.
 * Implementing classes provide the behavior for each state transition.
 * 
 * @author Vrinda
 * @version 1.0
 */
public interface State {

	/**
     * Handles a single press of the left pedal.
     *
     * @param context the rover's context
     */
	void pressLeftPedalOnce(Context context);
	
	 /**
     * Handles a single press of the right pedal.
     *
     * @param context the rover's context
     */
	void pressRightPedalOnce(Context context);
	
	 /**
     * Handles holding the left pedal for more than three seconds.
     *
     * @param context the rover's context
     */
	void pressLeftPedalMoreThanThreeSeconds(Context context);
	
	 /**
     * Handles holding the right pedal for more than three seconds.
     *
     * @param context the rover's context
     */
	void pressRightPedalMoreThanThreeSeconds(Context context);
}