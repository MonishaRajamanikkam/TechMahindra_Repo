package exceptionHandling;
import java.io.*;

public class FileReaderExample {  
    public static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filePath);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) { // Explicitly using FileReader
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            readFile("hello.txt"); // Change to the path of the file you want to read
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
