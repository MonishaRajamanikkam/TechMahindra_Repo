package Collections;
import java.util.LinkedList;
import java.util.List;
public class InsertSomeElements {
	
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        List<String> colors = new LinkedList<>();

	        // Add some initial colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Purple");

	        // Print the original list
	        System.out.println("Original LinkedList: " + colors);

	        // Elements to insert
	        LinkedList<String> newColors = new LinkedList<>();
	        newColors.add("Yellow");
	        newColors.add("Orange");

	        // Specify the position to insert
	        int index = 2;

	        // Insert elements at the specified position
	        if (index >= 0 && index <= colors.size()) {
	            ((LinkedList<String>) colors).addAll(index, newColors);
	        } else {
	            System.out.println("Invalid index!");
	        }

	        // Print the updated list
	        System.out.println("Updated LinkedList after insertion: " + colors);
	    }
	}
