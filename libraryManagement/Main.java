package libraryManagement;
import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Main {
    public static void main(String[] args) {
        final LibraryManager libManager = new LibraryManager();
        // Initialize Books
        libManager.addBook(new Book("Java Programming", "James ", "123"));
        libManager.addBook(new Book("Data Structures", "Robert ", "456"));
        // Initialize Users
        libManager.addUser(new User("Aryan", "U1"));
        libManager.addUser(new User("Mathi", "U2"));
        // Multithreading Simulation
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(() -> {
            try {
                libManager.borrowBook("123", "U1");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        executor.execute(() -> {
            try {
                libManager.borrowBook("456", "U2");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        executor.shutdown();

        // Save Data
        saveLibraryData(libManager);
    }

    private static void saveLibraryData(LibraryManager libManager) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("library.dat"))) {
            oos.writeObject(libManager);
        } catch (IOException e) {
            System.out.println("Error saving library data: " + e.getMessage());
        }
    }

    private static LibraryManager loadLibraryData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("library.dat"))) {
            return (LibraryManager) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new LibraryManager();  // If file doesn't exist, return new library
        }
    }
}


