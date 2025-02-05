package tm;
//Final class - cannot be extended
public class FinalClass {
	    // Final variable - cannot be reassigned
	    private final int MAX_SPEED = 120;
	    // Getter method to access final variable
	    public int getMaxSpeed() {
	        return MAX_SPEED;
	    }
	    // Final method - cannot be overridden
	    public final void showMessage() {
	        System.out.println("This is a final method inside a final class.");
	    }
	}

