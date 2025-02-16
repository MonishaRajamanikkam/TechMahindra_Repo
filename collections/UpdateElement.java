package Collections;
import java.util.ArrayList;
import java.util.List;
public class UpdateElement {
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

	        // Specify the index to update
	        int index = 2;
	        String newColor = "Pink";

	        // Update the element at the specified index
	        if (index >= 0 && index < colors.size()) {
	            colors.set(index, newColor);
	            System.out.println("Updated List: " + colors);
	        } else {
	            System.out.println("Invalid index!");
	        }
	    }
	}


