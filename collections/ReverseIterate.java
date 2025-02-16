package Collections;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseIterate {

    public static void main(String[] args) {
        // Create a LinkedList of colors
        List<String> colors = new LinkedList<>();

        // Add some colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the original list
        System.out.println("Original LinkedList: " + colors);

        // Reverse the list using Collections API
        Collections.reverse(colors);

        // Print the reversed list
        System.out.println("\nIterating in reverse order:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

