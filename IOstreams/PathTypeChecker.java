package IOStreams;
import java.io.*;
import java.util.Scanner;
public class PathTypeChecker {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Get pathname from user
	        System.out.print("Enter file or directory path: ");
	        String path = scanner.nextLine();
	        
	        File file = new File(path);
	        
	        if (file.exists()) {
	            if (file.isDirectory()) {
	                System.out.println("The specified path is a directory.");
	            } else if (file.isFile()) {
	                System.out.println("The specified path is a file.");
	            }
	        } else {
	            System.out.println("The specified path does not exist.");
	        }
	        
	        scanner.close();
	    }
	}
