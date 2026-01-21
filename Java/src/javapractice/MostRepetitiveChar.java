package javapractice;

public class MostRepetitiveChar {
	
	public static void main(String[] args) {
		String str="programmingm";
		int maxCount=0;
		char result=' ';
		
		for(int i=0; i<str.length(); i++) {
			int count=0;
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
				
				if(count>maxCount) {
					maxCount=count;
					result=str.charAt(i);
				}
			}
		}
		
		System.out.println("Most repetitive character: "+result);
	}

}
