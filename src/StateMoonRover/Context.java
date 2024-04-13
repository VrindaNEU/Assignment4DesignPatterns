package StateMoonRover;

/**
 * Manages the state of a moon rover.
 * Encapsulates the current state and provides methods to set and get the state.
 * Initial state is set to AtRest.
 *
 * @author Vrinda
 * @version 1.0
 */
public class Context {
	
	private State state;
	
	/**
	 * Constructs a new Context object with the initial state set to AtRest.
	 */
	public Context() {
		state = new AtRest();
	}
	
	/**
	 * Sets the state of the moon rover.
	 *
	 * @param state the new state to set
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/**
	 * Gets the current state of the moon rover.
	 *
	 * @return the current state
	 */
	public State getState() {
		return state;
	}

}
