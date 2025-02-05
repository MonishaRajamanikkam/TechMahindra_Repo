package tm;

public class DivideWithoutSlash {
	public static void main(String[]args) {
		 // Define two numbers: num1 (dividend) and num2 (divisor)
		int num1=67;
		int num2=3;
		// Initialize quotient to store the result of division
		int quotient=0;
		 // Initialize a dummy variable to accumulate divisor values
		int dummyVar=0;
		// Loop runs from 0 to num1, simulating repeated subtraction (division)
		for(int i=0;i<num1 ;i++) {
			// Add the divisor (num2) to dummyVar in each iteration
			dummyVar+=num2;
			 // Increment quotient for each successful subtraction
			quotient++;
			// If dummyVar exceeds num1, adjust quotient and calculate remainder
			if(dummyVar>num1) {
				System.out.println("Quotient is "+(quotient-1));
				 // Calculate remainder: remainder = dividend - (dummyVar - divisor)
				int remainder=num1-(dummyVar-num2);
				System.out.println("Remainder is "+remainder);
				break;// Exit the loop since division is complete
			}
			// If dummyVar is exactly equal to num1, division is perfect (remainder = 0)
			if (dummyVar==num1) {
				System.out.println("Quotient is "+quotient);
				System.out.println("Remainder is "+0);
				break;// Exit the loop
			}
		}
	}
}




