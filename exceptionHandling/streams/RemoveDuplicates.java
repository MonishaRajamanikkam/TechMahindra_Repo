package streams;
import java.util.*;
import java.util.stream.*;
public class RemoveDuplicates {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 10, 20, 30);
	        System.out.println("List without duplicates: " + numbers.stream().distinct().collect(Collectors.toList()));
	    }
	}


