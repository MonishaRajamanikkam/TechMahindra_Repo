package generics;
import java.util.*;
import java.util.stream.*;
public class SumOfOddAndEven {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(5, 2, 3, 8, 5, 6, 0, 8, 9, 17);
	        
	        Map<String, Integer> sums = calculateEvenOddSums(numbers);
	        
	        System.out.println("Sum of even numbers: " + sums.get("even"));
	        System.out.println("Sum of odd numbers: " + sums.get("odd"));
	    }
	    
	    public static <T extends Number> Map<String, Integer> calculateEvenOddSums(List<T> numbers) {
	        int sumEven = numbers.stream().mapToInt(Number::intValue).filter(n -> n % 2 == 0).sum();
	        int sumOdd = numbers.stream().mapToInt(Number::intValue).filter(n -> n % 2 != 0).sum();
	        Map<String, Integer> result = new HashMap<>();
	        result.put("even", sumEven);
	        result.put("odd", sumOdd);
	        
	        return result;
	    }
	}


