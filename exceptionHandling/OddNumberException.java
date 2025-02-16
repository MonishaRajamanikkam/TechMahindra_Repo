package exceptionHandling;

public class OddNumberException {
	
	    public static void main(String[] args) {
	        try {
	            checkEvenNumber(5); // This will throw an exception
	        } catch (IllegalArgumentException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }
	    
	    public static void checkEvenNumber(int number) {
	        if (number % 2 != 0) {
	            throw new IllegalArgumentException("Number is odd so not allowed.");
	        }
	        System.out.println("Number is even: " + number);
	    }
	}

