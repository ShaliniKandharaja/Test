package javapracticenumberbased;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInNumber {
	
	public static void main(String[] args) {

        int num = 224566;
        String str = String.valueOf(num);
        char[] charArray = str.toCharArray();

        Set<Character> set = new LinkedHashSet<>();

        for (char ch : charArray) {
            set.add(ch);
        }

        System.out.println(set);

        // Convert characters to String
        String result = "";
        for (char c : set) {
            result = result + c;
        }

        // Convert String to int
        int finalNumber = Integer.parseInt(result);
        System.out.println(finalNumber);
    }

}
