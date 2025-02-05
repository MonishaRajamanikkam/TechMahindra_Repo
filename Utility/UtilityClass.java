package utility;

public class NumberUtils {
	    // Utility method to find the length of an integer without using built-in methods
	    public static int getIntegerLength(int input) {
	        if (input == 0) return 1; // Special case for 0
	        int count = 0;
	        if (input < 0) {
	           input = -input; // Convert negative to positive
	        }
	        while (input > 0) {
	            count++;
	            input /= 10; // Remove the last digit
	        }
	        return count;
	    }
	}

