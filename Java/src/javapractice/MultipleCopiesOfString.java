package javapractice;

public class MultipleCopiesOfString {
	
	public static void main(String[] args) {
		String str="Hello";
		int num=3;
		String result="";
		
		for(int i=0; i<num; i++) {
			result=result+str;
		}
		
		System.out.println(result);
	}

}
