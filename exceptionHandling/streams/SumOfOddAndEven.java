package streams;

import java.util.Arrays;
import java.util.List;

public class SumOfOddAndEven {
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(4,7,29,4);
		System.out.println("Sum of even numbers :"+numbers.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum());
		System.out.println("Sum of odd numbers :"+numbers.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum());
	}

}
