package Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class IterateFromPosition {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add some colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the original list
        System.out.println("Original LinkedList: " + colors);

        // Specify the starting position
        int startIndex = 2;

        // Check if index is valid
        if (startIndex >= 0 && startIndex < colors.size()) {
            // Create an iterator starting at the specified index
            Iterator<String> iterator = colors.listIterator(startIndex);

            System.out.println("\nIterating from index " + startIndex + ":");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } else {
            System.out.println("\nInvalid start index!");
        }
    }
}

