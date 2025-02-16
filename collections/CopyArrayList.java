package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CopyArrayList {

    public static void main(String[] args) {
        // Create the source ArrayList
        List<String> sourceList = new ArrayList<>();
        sourceList.add("Red");
        sourceList.add("Green");
        sourceList.add("Blue");
        sourceList.add("Yellow");
        sourceList.add("Purple");

        // Create the destination ArrayList with the same size as the source list
        List<String> destinationList = new ArrayList<>(Collections.nCopies(sourceList.size(), ""));

        // Copy source list into destination list
        Collections.copy(destinationList, sourceList);

        // Print both lists
        System.out.println("Source List: " + sourceList);
        System.out.println("Copied List: " + destinationList);
    }
}
