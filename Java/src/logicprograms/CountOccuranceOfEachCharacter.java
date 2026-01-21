package logicprograms;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfEachCharacter {
	
	public static void main(String[] args) {

        String var = "Shalini";

        Map<Character, Integer> countMap = new HashMap<Character, Integer>();
        char[] charArray = var.toCharArray();

        for (char ch : charArray) {
            if (countMap.containsKey(ch)) {
                countMap.put(ch, countMap.get(ch) + 1);
            } else {
                countMap.put(ch, 1);
            }
        }

        System.out.print(countMap);
    }

}
