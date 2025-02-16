package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SortArrayList {
	
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        List<String> colors = new ArrayList<>();

	        // Add some colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Print the original list
	        System.out.println("Original List: " + colors);

	        // Sort the list
	        Collections.sort(colors);

	        // Print the sorted list
	        System.out.println("Sorted List: " + colors);
	    }
	}


