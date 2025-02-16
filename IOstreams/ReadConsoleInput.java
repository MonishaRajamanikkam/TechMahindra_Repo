package IOStreams;
import java.util.Scanner;

public class ReadConsoleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter some text: ");
        String input = scanner.nextLine();
        
        System.out.println("You entered: " + input);
        
        scanner.close();
    }
}
