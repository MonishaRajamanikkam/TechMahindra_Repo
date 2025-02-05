package tm;
import java.util.Scanner; 
public class ExceptionHandlingDemo {
	public static void processInput() {
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            // Prompt the user for input
	            System.out.print("Enter a number: ");
	            double number = scanner.nextDouble(); // Read numerical input
	            
	            // Check if the number is zero to prevent division by zero
	            if (number == 0) {
	                throw new ArithmeticException("Division by zero is not allowed.");
	            }
	            
	            // Calculate the reciprocal
	            double reciprocal = 1 / number;
	            System.out.println("Reciprocal: " + reciprocal);
	            
	        } catch (ArithmeticException e) {
	            // Handle division by zero
	            System.out.println("Error: " + e.getMessage());
	        } catch (java.util.InputMismatchException e) {
	            // Handle non-numeric input
	            System.out.println("Error: Invalid input. Please enter a valid number.");
	        } finally {
	            // Close the scanner to avoid resource leaks
	            scanner.close();
	            System.out.println("Input process completed.");
	        }
	    }

	    public static void main(String[] args) {
	        processInput(); // Call the method
	    }
	}



