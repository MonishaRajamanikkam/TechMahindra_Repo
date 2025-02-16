package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertCaseOfString {
	public static void main(String[] args) {
	List<String>s=Arrays.asList("monisha","krishitha","muthu","nandhini","sanjana");
	//convert to uppercase
	ArrayList<String>upperCaseString=(ArrayList<String>)s.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
	System.out.println(upperCaseString);
	
	//convert to lower case
	List<String>str=Arrays.asList("MONI","ANU","Muthu","NAndhini","SANJjana");
	ArrayList<String>lowerCaseString=(ArrayList<String>)str.stream().map(names->names.toLowerCase()).collect(Collectors.toList());
	System.out.println(lowerCaseString);
	
}}
