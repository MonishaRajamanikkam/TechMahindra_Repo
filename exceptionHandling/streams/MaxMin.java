package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(3,6,1,8,2);
		System.out.println("Maximum value: "+numbers.stream().max(Integer::compare).orElse(Integer.MAX_VALUE));
		System.out.println("Minimum value: "+numbers.stream().min(Integer::compare).orElse(Integer.MIN_VALUE));
		
	}

}
