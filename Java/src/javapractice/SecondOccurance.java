package javapractice;

public class SecondOccurance {

	public static void main(String[] args) {
		
		String str="swiss";
		int count=0;
		
		for(char ch : str.toCharArray()) {
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				count++;
				if(count==2) {
					System.out.println(ch);
				}
			}
		}

	}

}
