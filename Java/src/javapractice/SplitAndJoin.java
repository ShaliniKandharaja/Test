package javapractice;

public class SplitAndJoin {

	public static void main(String[] args) {
		
		String str="Welcome to IT";
		String[] words=str.split(" ");
		
		for(String word : words) {
			System.out.println(word);
		}
		
	//	System.out.println(words[0]);
		
	String joined=	String.join("-", "Learn", "Automation", "Online");
	System.out.println(joined);

	}

}
