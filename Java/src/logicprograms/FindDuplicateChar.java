package logicprograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateChar {
	public static void main(String[] args) {

		String var = "banana";
		// var = var.toLowerCase();

		Set<Character> set = new HashSet<>();
		Set<Character> duplicates = new HashSet<>();

		char[] charArray = var.toCharArray();

		for (char ch : charArray) {
			// set.add(ch);
			if (!set.add(ch)) {
				duplicates.add(ch);
			}
		}

		//System.out.println("Unique elements are: " + set);
		System.out.println("Duplicate elements are: ");
		System.out.println(duplicates);
	}

}
