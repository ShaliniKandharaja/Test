package javapractice;

import java.util.HashSet;
import java.util.Set;

public class CountVowelsInString {
	
	public static void main(String[] args) {
		
		String var="education";
		int count=0;
		//store vowels in a set
		Set<Character> vowels=new HashSet<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		//check each character
		
		for(char ch : var.toCharArray()) {
			if(vowels.contains(ch)) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}

}
