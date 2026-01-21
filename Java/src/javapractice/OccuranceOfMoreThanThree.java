package javapractice;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfMoreThanThree {
	
	public static void main(String[] args) {
		
		//Step:1 Count occurrence of each character
		String str="Programmingmm";
		char[] charArray=str.toCharArray();
		
		Map<Character,Integer> countMap=new HashMap<Character,Integer>();
		
		for(char ch : charArray) {
			if(countMap.containsKey(ch)) {
				countMap.put(ch, countMap.get(ch)+1);
			}
			else {
				countMap.put(ch,1);
			}
		}
		
		System.out.println(countMap);
		
		//Step:2 Print Characters occurring more than 3 times
		for(char key: countMap.keySet()) {
			if(countMap.get(key)>3) {
				System.out.println(key);
			}
		}
		
		
	}

}
