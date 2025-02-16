package IOStreams;
import java.io.*;
import java.util.Scanner;

public class ListFileIndirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get directory path from user
        System.out.print("Enter directory path: ");
        String directoryPath = scanner.nextLine();
        
        File directory = new File(directoryPath);
        
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified path is not a directory or does not exist.");
            return;
        }
        
        try {
            File[] files = directory.listFiles();
            if (files != null) {
                System.out.println("Files and directories in " + directoryPath + ":");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("Error retrieving contents of the directory.");
            }
        } catch (SecurityException e) {
            System.out.println("Permission denied: " + e.getMessage());
        }
        
        scanner.close();
    }
}
