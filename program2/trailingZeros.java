package tm;

public class TrailingZeros {
	public static void main(String[] args) {
        //give the input number to check the number of digits of zeros in its factorila
		int number = 70;
		//initialize the count value with 0 to store the number of trailing zeros
		int count = 0;
		// Loop to count the number of factors of 5 in the factorial of the given number
		// A trailing zero is produced by factors of 10, which is the product of 2 and 5
		// Since there are always more factors of 2 than 5, we only count factors of 5
		for (int i = 5; i <= number; i *= 5) {
			count += number / i;
		}
		System.out.println(count);
	}
}



