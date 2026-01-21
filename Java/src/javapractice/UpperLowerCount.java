package javapractice;

public class UpperLowerCount {

	public static void main(String[] args) {
		
		String var="HelloWorld";
		int upper=0;
		int lower=0;
		
		for(char ch : var.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				upper++;
			}
			else if(Character.isLowerCase(ch)) {
				lower++;
			}
		}
		
		System.out.println(upper);
		System.out.println(lower);

	}

}
