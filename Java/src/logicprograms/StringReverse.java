package logicprograms;

public class StringReverse {
	
	public static void main(String[] args) {
	
	String str="Shalini";
	
	char[] charArray=str.toCharArray();
	
	for(int i=charArray.length-1; i>=0; i--) {
		System.out.print(charArray[i]);
	}
	
	}

}
