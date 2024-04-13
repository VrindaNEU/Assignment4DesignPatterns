package StateMoonRover;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Contains test cases for the moon rover state transitions in the MoonRoverDemo.
 * Tests the behavior of the moon rover when transitioning between different states.
 * Each test method simulates a specific scenario of state transition and verifies the resulting state.
 *
 * @author Vrinda
 * @version 1.0
 */
public class MoonRoverDemo_Test {
	
	 /**
     * Test case for starting from rest and transitioning to ForwardAcceleration.
     * Creates a Context instance and starts from the AtRest state.
     * Presses the left pedal once and verifies that the state transitions to ForwardAcceleration.
     */
	  @Test
	    public void testStartingFromRestAndTransitioningToForwardAcceleration() {
	        Context context = new Context();
	        State atRest = new AtRest();
	        atRest.pressLeftPedalOnce(context);
	        assertEquals(context.getState().getClass(), ForwardAcceleration.class);
	    }

	    /**
	     * Test case for starting from rest and transitioning to BackwardAcceleration.
	     * Creates a Context instance and starts from the AtRest state.
	     * Holds the left pedal for more than three seconds and verifies that the state transitions to BackwardAcceleration.
	     */  
	    @Test
	    public void testStartingFromRestAndTransitioningToBackwardAcceleration() {
	        Context context = new Context();
	        State atRest = new AtRest();
	        atRest.pressLeftPedalMoreThanThreeSeconds(context);
	        assertEquals(context.getState().getClass(), BackwardAcceleration.class);
	    }

	    /**
	     * Test case for transitioning to ForwardAcceleration from AtRest.
	     * Creates a Context instance and starts from the AtRest state.
	     * Presses the left pedal once and verifies that the state transitions to ForwardAcceleration.
	     */
	    @Test
	    public void testForwardAcceleration() {
	        Context context = new Context();
	        State atRest = new AtRest();
	        atRest.pressLeftPedalOnce(context);
	        assertEquals(context.getState().getClass(), ForwardAcceleration.class);
	    }

	    /**
	     * Test case for transitioning to ConstantForwardSpeed from ForwardAcceleration.
	     * Creates a Context instance and starts from the ForwardAcceleration state.
	     * Holds the right pedal for more than three seconds and verifies that the state transitions to ConstantForwardSpeed.
	     */
	    @Test
	    public void testConstantForwardSpeed() {
	        Context context = new Context();
	        State forwardAcceleration = new ForwardAcceleration();
	        forwardAcceleration.pressRightPedalMoreThanThreeSeconds(context);
	        assertEquals(context.getState().getClass(), ConstantForwardSpeed.class);
	    }

	    /**
	     * Test case for transitioning to BackwardAcceleration from AtRest.
	     * Creates a Context instance and starts from the AtRest state.
	     * Holds the left pedal for more than three seconds and verifies that the state transitions to BackwardAcceleration.
	     */
	    @Test
	    public void testBackwardAcceleration() {
	        Context context = new Context();
	        State atRest = new AtRest();
	        atRest.pressLeftPedalMoreThanThreeSeconds(context);
	        assertEquals(context.getState().getClass(), BackwardAcceleration.class);
	    }

	    /**
	     * Test case for transitioning to ConstantBackwardSpeed from BackwardAcceleration.
	     * Creates a Context instance and starts from the BackwardAcceleration state.
	     * Holds the right pedal for more than three seconds and verifies that the state transitions to ConstantBackwardSpeed.
	     */
	    @Test
	    public void testConstantBackwardSpeed() {
	        Context context = new Context();
	        State backwardAcceleration = new BackwardAcceleration();
	        backwardAcceleration.pressRightPedalMoreThanThreeSeconds(context);
	        assertEquals(context.getState().getClass(), ConstantBackwardSpeed.class);
	    }

	    /**
	     * Test case for returning to AtRest state from ConstantForwardSpeed.
	     * Creates a Context instance and starts from the ConstantForwardSpeed state.
	     * Presses the right pedal once and verifies that the state transitions to AtRest.
	     */
	    @Test
	    public void testReturnToAtRestFromConstantForwardSpeed() {
	        Context context = new Context();
	        State constantForwardSpeed = new ConstantForwardSpeed();
	        constantForwardSpeed.pressRightPedalOnce(context);
	        assertEquals(context.getState().getClass(), AtRest.class);
	    }

	    /**
	     * Test case for returning to AtRest state from ConstantBackwardSpeed.
	     * Creates a Context instance and starts from the ConstantBackwardSpeed state.
	     * Presses the right pedal once and verifies that the state transitions to AtRest.
	     */
	    @Test
	    public void testReturnToAtRestFromConstantBackwardSpeed() {
	        Context context = new Context();
	        State constantBackwardSpeed = new ConstantBackwardSpeed();
	        constantBackwardSpeed.pressRightPedalOnce(context);
	        assertEquals(context.getState().getClass(), AtRest.class);
	    }

	   
}

