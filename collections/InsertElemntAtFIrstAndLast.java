package Collections;
import java.util.LinkedList;
import java.util.List;
public class InsertElemntAtFIrstAndLast {
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        List<String> colors = new LinkedList<>();

	        // Add some colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");

	        // Print the original list
	        System.out.println("Original LinkedList: " + colors);

	        // Insert element at the first position
	        ((LinkedList<String>) colors).addFirst("Yellow");

	        // Insert element at the last position
	        ((LinkedList<String>) colors).addLast("Purple");

	        // Print the updated list
	        System.out.println("Updated LinkedList after insertion: " + colors);
	    }
	}
