package IOStreams;
import java.io.File;
import java.util.Scanner;

public class FileSizeChecker {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Get file path from user
	        System.out.print("Enter file path: ");
	        String filePath = scanner.nextLine();
	        
	        File file = new File(filePath);
	        
	        if (file.exists() && file.isFile()) {
	            long bytes = file.length();
	            double kilobytes = bytes / 1024.0;
	            double megabytes = kilobytes / 1024.0;
	            
	            System.out.println("File size:");
	            System.out.println("Bytes: " + bytes);
	            System.out.println("Kilobytes: " + String.format("%.2f", kilobytes));
	            System.out.println("Megabytes: " + String.format("%.2f", megabytes));
	        } else {
	            System.out.println("The specified file does not exist.");
	        }
	        
	        scanner.close();
	    }
	}
