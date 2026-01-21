package logicprograms;

public class CountNumbersOfString {
	
	public static void main(String[] args) {

        /*
        String var = "Shalini12345";
        int count = 0;
        int sum = 0;

        for (int i = 0; i < var.length(); i++) {
            char ch = var.charAt(i);

            if (Character.isDigit(ch)) {
                count++;
                sum = sum + Character.getNumericValue(ch);
            }
        }

        System.out.println("Count of Digits " + count);
        System.out.println("Sum of Digits " + sum);
        */

	
	 String var = "Shalini128965";
     int count = 0;
     int sum = 0;

     for (char ch : var.toCharArray()) {
         if (Character.isDigit(ch)) {
             count++;
             sum = sum + Character.getNumericValue(ch);
         }
     }

     System.out.println(count);
     System.out.println(sum);
 }

}
