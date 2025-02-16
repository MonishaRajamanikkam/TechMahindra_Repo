package Collections;
import java.util.LinkedList;
import java.util.List;
public class InsertElementAtEnd {
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        List<String> colors = new LinkedList<>();

	        // Add some colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");

	        // Print the original list
	        System.out.println("Original LinkedList: " + colors);

	        // Insert an element at the end
	        ((LinkedList<String>) colors).addLast("Yellow");

	        // Print the updated list
	        System.out.println("Updated LinkedList after inserting at end: " + colors);
	    }
	}

