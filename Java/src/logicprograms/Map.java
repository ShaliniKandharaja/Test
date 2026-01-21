package logicprograms;

import java.util.HashMap;

public class Map {
	
	public static void main(String[] args) {

        String var = "Air Canada";
        var = var.replaceAll(" ", "");
        char[] charArray = var.toCharArray();

        HashMap<Character, Integer> countMap = new HashMap<>();
        

        for (char ch : charArray) {
            if (countMap.containsKey(ch)) {
                countMap.put(ch, countMap.get(ch) + 1);
            } else {
                countMap.put(ch, 1);
            }
        }

        System.out.println(countMap);
    }

}
