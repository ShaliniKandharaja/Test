package javapracticenumberbased;

public class NumberToWords {
	
	public static void main(String[] args) {

        int num = 123;
        int rev = 0;

        // Reverse number
        while (num>0) {
            int digit = num%10;
            rev = (rev*10) + digit;
            num = num/10;
        }

        // get numbers and print in words
        while (rev > 0) {
            int digit = rev % 10;

            switch (digit) {
                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;
            }

            rev = rev / 10;
        }
    }

}
