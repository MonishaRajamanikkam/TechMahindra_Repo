package Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class IterateElements {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add some colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Iterate using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        

        // Iterate using forEach() method (Java 8+)
        System.out.println("\nIterating using forEach() method:");
        colors.forEach(System.out::println);
    }
}

