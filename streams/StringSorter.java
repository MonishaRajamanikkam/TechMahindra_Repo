package streams;
	import java.util.*;
	import java.util.stream.*;

	public class StringSorter {
	    public static void main(String[] args) {
	        List<String> words = Arrays.asList("anu", "moni", "aathi", "cherry", "mathi", "blueberry");
	        System.out.println("Ascending Order: " + words.stream().sorted().collect(Collectors.toList()));
	        System.out.println("Descending Order: " +words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()) );
	    }
	}


