package logicprograms;

public class CountOfSpecificCharacter {
	
	public static void main(String[] args) {
		String str = "Ababaab";
        str = str.toLowerCase();
        char target = 'a';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Character a occurs " + count + " times");
    
	}

}
