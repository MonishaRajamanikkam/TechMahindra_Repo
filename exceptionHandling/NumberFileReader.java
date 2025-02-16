package exceptionHandling;
import java.io.*;
import java.util.*;
public class NumberFileReader {
	public static void readNumbersFromFile(String filePath) throws FileNotFoundException, PositiveNumberException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filePath);
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    if (number > 0) {
                        throw new PositiveNumberException("Positive number found: " + number);
                    }
                    System.out.println("Read number: " + number);
                } else {
                    scanner.next(); // Skip non-integer values
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            readNumbersFromFile("hello.txt"); // Change to your file path
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (PositiveNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}


