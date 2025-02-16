package generics;
	import java.util.*;
	public class GenericMerge {

	    // Generic method to merge two lists by alternating elements
	    public static <T> List<T> mergeAlternating(List<T> list1, List<T> list2) {
	        List<T> mergedList = new ArrayList<>();
	        int maxSize = Math.max(list1.size(), list2.size());

	        for (int i = 0; i < maxSize; i++) {
	            if (i < list1.size()) {
	                mergedList.add(list1.get(i));
	            }
	            if (i < list2.size()) {
	                mergedList.add(list2.get(i));
	            }
	        }

	        return mergedList;
	    }

	    public static void main(String[] args) {
	        List<Integer> intList1 = Arrays.asList(1, 3, 5);
	        List<Integer> intList2 = Arrays.asList(2, 4, 6, 8);
	        List<String> strList1 = Arrays.asList("A", "C", "E");
	        List<String> strList2 = Arrays.asList("B", "D", "F", "G");

	        System.out.println("Merged intLists: " + mergeAlternating(intList1, intList2));
	        System.out.println("Merged strLists: " + mergeAlternating(strList1, strList2));
	    }
	}


