package javapractice;

public class CapitalizeEachWord {
	
	public static void main(String[] args) {
		String str="welcome to java";
		String[] words=str.split(" ");
		
		for(String word: words) {
			String firstLetter = word.substring(0,1).toUpperCase();
			String remainingLetter = word.substring(1);
			System.out.print(firstLetter+ remainingLetter + " ");
			
		}
	}

}
