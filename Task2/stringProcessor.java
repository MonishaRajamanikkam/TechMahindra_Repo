package tm;

public class StringProcessor {
	
	    // Method to reverse a string
	    public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder(str);
	        return reversed.reverse().toString();
	    }

	    // Method to count occurrences of a substring in a text
	    public static int countOccurrences(String text, String sub) {
	        int count = 0;
	        int index = 0;
	        while ((index = text.indexOf(sub, index)) != -1) {
	            count++;
	            index += sub.length();
	        }
	        return count;
	    }

	    // Method to split a string and capitalize each word
	    public static String splitAndCapitalize(String str) {
	        String[] words = str.split(" ");
	        StringBuilder result = new StringBuilder();
	        for (String word : words) {
	            if (!word.isEmpty()) {
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1))
	                      .append(" ");
	            }
	        }
	        return result.toString().trim();
	    }

	    public static void main(String[] args) {
	        String text = "This is a java program";
	        System.out.println("Reversed: " + reverseString(text));
	        System.out.println("Occurrences of 'is': " + countOccurrences(text, "is"));
	        System.out.println("Capitalized: " + splitAndCapitalize(text));
	    }
	}


