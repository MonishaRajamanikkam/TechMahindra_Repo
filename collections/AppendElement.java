package Collections;
import java.util.LinkedList;
public class AppendElement {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add some colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print the original list
        System.out.println("Original LinkedList: " + colors);

        // Append an element to the end of the list
        colors.add("Purple");

        // Print the updated list
        System.out.println("Updated LinkedList after appending: " + colors);
    }
}
