package Collections;
import java.util.ArrayList;
import java.util.List;
public class InsertElementInList {
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

	        // Insert an element at the first position
	        colors.add(0, "Black");

	        // Print the updated list
	        System.out.println("Updated List after inserting at first position: " + colors);
	    }
	}


