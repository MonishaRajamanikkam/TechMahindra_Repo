package generics;
import java.util.*;
public class Reversal {
	    // Generic method to reverse a list
	    public static <T> List<T> reverseList(List<T> list) {
	        List<T> reversedList = new ArrayList<>(list);
	        Collections.reverse(reversedList);
	        return reversedList;
	    }

	    public static void main(String[] args) {
	        List<Integer> intList = Arrays.asList(1, 7, 3, 42, 9);
	        List<String> strList = Arrays.asList("hello", "hii", "good  morning");
	        System.out.println("Original intList: " +intList);
	        System.out.println("Reversed intList: " + reverseList(intList));
	        System.out.println("Original strList: " +strList);
	        System.out.println("Reversed strList: " + reverseList(strList));
	    }
	}


