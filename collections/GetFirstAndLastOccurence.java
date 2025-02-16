package Collections;
import java.util.LinkedList;
public class GetFirstAndLastOccurence {
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colors = new LinkedList<>();

	        // Add some colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Green");
	        colors.add("Purple");

	        // Print the original list
	        System.out.println("Original LinkedList: " + colors);

	        // Specify the element to search for
	        String target = "Green";

	        // Get the first and last occurrences
	        int firstIndex = colors.indexOf(target);
	        int lastIndex = colors.lastIndexOf(target);

	        // Print results
	        if (firstIndex != -1) {
	            System.out.println("First occurrence of '" + target + "' is at index: " + firstIndex);
	            System.out.println("Last occurrence of '" + target + "' is at index: " + lastIndex);
	        } else {
	            System.out.println("'" + target + "' not found in the LinkedList.");
	        }
	    }
	}
