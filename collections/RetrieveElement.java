package Collections;
import java.util.ArrayList;
import java.util.List;
public class RetrieveElement {

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

        // Specify the index to retrieve
        int index = 2;

        // Retrieve the element at the specified index
        if (index >= 0 && index < colors.size()) {
            String color = colors.get(index);
            System.out.println("Element at index " + index + ": " + color);
        } else {
            System.out.println("Invalid index!");
        }
    }
}

