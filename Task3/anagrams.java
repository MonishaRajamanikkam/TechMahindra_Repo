package tm;
import java.util.*;
public class Anagrams {
	    public static List<Integer> findAnagrams(String s, String p) {
	        List<Integer> result = new ArrayList<>();
	        if (s.length() < p.length()) return result;
	        
	        int[] pCount = new int[26];
	        int[] sCount = new int[26];
	        
	        // Fill frequency count for p and first window in s
	        for (int i = 0; i < p.length(); i++) {
	            pCount[p.charAt(i) - 'a']++;
	            sCount[s.charAt(i) - 'a']++;
	        }
	        
	        if (Arrays.equals(pCount, sCount)) {
	            result.add(0);
	        }
	        
	        // Sliding window approach
	        for (int i = p.length(); i < s.length(); i++) {
	            sCount[s.charAt(i) - 'a']++; // Add new character to the window
	            sCount[s.charAt(i - p.length()) - 'a']--; // Remove the leftmost character
	            
	            if (Arrays.equals(pCount, sCount)) {
	                result.add(i - p.length() + 1);
	            }
	        }
	        
	        return result;
	    }
	    
	    public static void main(String[] args) {
	        String s = "cbaebabacd";
	        String p = "abc";
	        System.out.println("Anagram start indices: " + findAnagrams(s, p));
	    }
	}


