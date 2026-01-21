package javapractice;

public class CheckSpecialChar {
	public static void main(String[] args) {
		String var="Hello@123";
		boolean hasSpecial=false;
		
		for(char ch : var.toCharArray()) {
			if(!Character.isLetterOrDigit(ch)) {
				hasSpecial=true;
			}
		}
		
		System.out.println("Contains special character :"+hasSpecial);
	}

}
