package Collections;
import java.util.ArrayList;
import java.util.List;
public class SearchElement {
	
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
	        System.out.println("Color List: " + colors);

	        // Element to search for
	        String searchColor = "Purple";

	        // Search for the element
	        if (colors.contains(searchColor)) {
	            System.out.println(searchColor + " is found at index: " + colors.indexOf(searchColor));
	        } else {
	            System.out.println(searchColor + " is not found in the list.");
	        }
	    }
	}


