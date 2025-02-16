package generics;
	import java.util.*;
	import java.util.stream.*;

	public class ListProcessor {
	    public static void main(String[] args) {
	        Integer[] array1 = {3, 7, 9, 4, 5};
	        Integer[] array2 = {3, 7, 9, 4, 5};
	        Integer[] array3 = {8, 2, 3, 5, 4};
	        
	        System.out.println("Are array1 and array2 equal? " + areArraysEqual(array1, array2));
	        System.out.println("Are array1 and array3 equal? " + areArraysEqual(array1, array3));
	    }
	    
	    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
	        return Arrays.equals(array1, array2);
	    }
	}


