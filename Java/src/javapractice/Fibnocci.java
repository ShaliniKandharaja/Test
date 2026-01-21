package javapractice;

public class Fibnocci {
	
	public static void main(String[] args) {
		
		int num=8;
		System.out.println("Fibonacci series is: ");
		int first=0;
		int second=1;
		
		for(int i=0; i<=num; i++) {
			System.out.print(first+" ");
			int next=first+second;
			first=second;
			second=next;
		}
		
		}

}
