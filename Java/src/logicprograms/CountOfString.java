package logicprograms;

public class CountOfString {
	
	public static void main(String[] args) {
		String var = "Hexa";
        String str = "Shalini Hexaware";

        int length = var.length();

        String[] words = str.split(" ");
        int strLength = words.length;

        System.out.println(length);
        System.out.println(strLength);
    
	}

}
