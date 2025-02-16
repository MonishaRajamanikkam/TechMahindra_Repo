package IOStreams;
import java.io.*;
import java.util.Scanner;

public class ReadFileLIneByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get file path from user
        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();
        
        File file = new File(filePath);
        
        if (!file.exists() || !file.isFile()) {
            System.out.println("The specified file does not exist.");
            return;
        }
        
        try (FileInputStream fis = new FileInputStream(file);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
            
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
        scanner.close();
    }
}
