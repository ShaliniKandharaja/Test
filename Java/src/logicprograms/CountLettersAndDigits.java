package logicprograms;

public class CountLettersAndDigits {
	public static void main(String[] args) {


		String var = "Sha12345";
		int letter = 0;
		int digit = 0;

		//for (int i = 0; i < var.length(); i++) {
			//char ch = var.charAt(i);
			for (char ch : var.toCharArray()) {
			if (Character.isLetter(ch)) {
				letter++;
			} else if (Character.isDigit(ch)) {
				digit++;
			}
		}

		System.out.println("Letters " + letter);
		System.out.println("Digits " + digit);



	}
	
}
