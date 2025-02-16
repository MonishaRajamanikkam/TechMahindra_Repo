package exceptionHandling;
import java.io.*;
public class FileReaderEx {
	    public static void main(String[] args) {
	        String filePath = "example.txt";
	        
	        try {
	            File file = new File(filePath);
	            if (!file.exists()) {
	                throw new FileNotFoundException("File not found: " + filePath);
	            }
	            
	            BufferedReader reader = new BufferedReader(new FileReader(file));
	            if (file.length() == 0) {
	                reader.close();
	                throw new IOException("File is empty: " + filePath);
	            }
	            
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	            reader.close();
	        } catch (IOException e) {
	            System.err.println("Error: " + e.getMessage());
	        }
	    }
	}



