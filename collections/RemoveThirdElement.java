package Collections;
import java.util.ArrayList;
import java.util.List;
public class RemoveThirdElement {
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

	        // Remove the third element (index 2)
	        int indexToRemove = 2;
	        if (indexToRemove >= 0 && indexToRemove < colors.size()) {
	            colors.remove(indexToRemove);
	            System.out.println("After removing third element: " + colors);
	        } else {
	            System.out.println("Invalid index!");
	        }
	    }
	}


