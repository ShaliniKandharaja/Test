package firstCode;

import java.util.Scanner;

public class GetValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;

		//Create object to scanner to read input
		Scanner obj=new Scanner(System.in);

		//Get a value from user
		System.out.println("Enter Value for A");
		a=obj.nextInt();

		//Get b value from user
		System.out.println("Enter Value for B");
		b=obj.nextInt();
		
		c=a+b;
		System.out.println(c);


	}

}
