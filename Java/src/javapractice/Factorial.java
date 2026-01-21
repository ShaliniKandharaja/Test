package javapractice;

public class Factorial {
//n!= n * (n-1) * (n-2) *...*1
//5!=5 * 4 * 3 * 2 * 1 =120
	
	public static void main(String[] args) {
		
		int num=6;
		int fact=1;  //Stores factorial result
		
		for(int i=1; i<=num; i++) { //loop runs from 1 to num
			fact=fact*i; //Each value of i multiplied with fact
		}
		
		System.out.println("Factorial is: "+fact);
	}
	

}
