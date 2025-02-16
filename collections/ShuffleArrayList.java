package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ShuffleArrayList {
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

        // Shuffle the list
        Collections.shuffle(colors);

        // Print the shuffled list
        System.out.println("Shuffled List: " + colors);
    }
}

