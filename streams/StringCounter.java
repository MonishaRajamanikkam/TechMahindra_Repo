package streams;
	import java.util.*;
	import java.util.stream.*;

	public class StringCounter {
	    public static void main(String[] args) {
	        List<String> words = Arrays.asList("apple", "orange", "apricot", "cherry", "avocado", "blueberry");
	        char targetLetter = 'a';
	        long count = words.stream().filter(word -> word.startsWith(String.valueOf(targetLetter))).count();
	        System.out.println("Number of words starting with '" + targetLetter + "': " + count);
	    }
	}


