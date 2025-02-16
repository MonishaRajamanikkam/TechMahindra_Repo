package IOStreams;
import java.io.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class LastModifiedFile {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Get file path from user
	        System.out.print("Enter file path: ");
	        String filePath = scanner.nextLine();
	        
	        File file = new File(filePath);
	        
	        if (file.exists() && file.isFile()) {
	            long lastModified = file.lastModified();
	            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	            System.out.println("Last modified date: " + sdf.format(lastModified));
	        } else {
	            System.out.println("The specified file does not exist.");
	        }
	        
	        scanner.close();
	    }
	}
