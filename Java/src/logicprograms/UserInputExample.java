package logicprograms;

import java.util.Scanner;

public class UserInputExample {
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter you name");
	String nextLine = sc.nextLine();
	
	System.out.println("Enter you age");
	int nextInt = sc.nextInt();
	
	System.out.println("Name you entered is :"+nextLine);
	System.out.println("Age you entered is :"+nextInt);
	
	sc.close();
	
	}

}
