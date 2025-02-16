package Collections;
import java.util.LinkedList;
import java.util.List;
public class InsertSpecifiedElemntInSpecifiedPosition {

    public static void main(String[] args) {
        // Create a LinkedList of colors
        List<String> colors = new LinkedList<>();

        // Add some colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print the original list
        System.out.println("Original LinkedList: " + colors);

        // Insert an element at a specified position
        int index = 2; // Position where the element will be inserted
        String newElement = "Purple";
        
        if (index >= 0 && index <= colors.size()) {
            colors.add(index, newElement);
        } else {
            System.out.println("Invalid index!");
        }

        // Print the updated list
        System.out.println("Updated LinkedList after insertion: " + colors);
    }
}

