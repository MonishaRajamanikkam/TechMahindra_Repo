package Task1;
import java.util.Arrays;
public class ArrayCopyRange {
	    public static void main(String[] args) {
	        // Original array
	        int[] originalArray = {10, 20, 30, 40, 50, 60};
	        
	        // Define the range to copy:
	        // start index is inclusive and end index is exclusive.
	        int startIndex = 1; // Starting from element 30
	        int endIndex = 5;   // Up to (but not including) element at index 5
	        
	        // Use Arrays.copyOfRange() to copy the specified range
	        int[] copiedRange = Arrays.copyOfRange(originalArray, startIndex, endIndex);
	        
	        // Display the original and the copied arrays
	        System.out.println("Original array: " + Arrays.toString(originalArray));
	        System.out.println("Copied range (from index " + startIndex + " to " + (endIndex - 1) + "): " 
	                           + Arrays.toString(copiedRange));
	    }
	}


