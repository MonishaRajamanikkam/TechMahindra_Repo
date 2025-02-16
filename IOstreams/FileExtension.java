package IOStreams;
import java.io.*;
import java.util.Scanner;

public class FileExtension {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Get directory path from user
	        System.out.print("Enter directory path: ");
	        String directoryPath = scanner.nextLine();
	        
	        // Get file extension from user
	        System.out.print("Enter file extension (e.g., txt, java): ");
	        String extension = scanner.nextLine();
	        
	        File directory = new File(directoryPath);
	        
	        if (!directory.exists() || !directory.isDirectory()) {
	            System.out.println("Invalid directory!");
	            return;
	        }
	        
	        // Using FilenameFilter to filter files based on extension
	        FilenameFilter filter = new FilenameFilter() {
	            @Override
	            public boolean accept(File dir, String name) {
	                return name.toLowerCase().endsWith("." + extension.toLowerCase());
	            }
	        };
	        
	        // Get the list of files with the specified extension
	        File[] files = directory.listFiles(filter);
	        
	        if (files == null || files.length == 0) {
	            System.out.println("No files found with extension ." + extension);
	        } else {
	            System.out.println("Files with extension ." + extension + ":");
	            for (File file : files) {
	                System.out.println(file.getName());
	            }
	        }
	        
	        scanner.close();
	    }
	}
