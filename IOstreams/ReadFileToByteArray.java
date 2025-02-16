package IOStreams;
import java.io.*;
import java.util.Scanner;

public class ReadFileToByteArray {

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
	        
	        try (FileInputStream fis = new FileInputStream(file)) {
	            byte[] fileData = new byte[(int) file.length()];
	            fis.read(fileData);
	            
	            System.out.println("File read successfully into byte array. Size: " + fileData.length + " bytes");
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	        
	        scanner.close();
	    }
	}
