package IOStreams;
import java.io.*;
import java.util.Scanner;
public class FilePermissionChecker {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Get pathname from user
	        System.out.print("Enter file or directory path: ");
	        String path = scanner.nextLine();
	        
	        File file = new File(path);
	        
	        if (file.exists()) {
	            System.out.println("Read permission: " + file.canRead());
	            System.out.println("Write permission: " + file.canWrite());
	        } else {
	            System.out.println("The specified path does not exist.");
	        }
	        
	        scanner.close();
	    }
	}
