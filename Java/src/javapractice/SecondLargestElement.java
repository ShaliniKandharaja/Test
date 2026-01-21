package javapractice;

import java.util.Arrays;

public class SecondLargestElement {
	
	public static void main(String[] args) {
		
		int[] arr= {10,5,20,8,15}; // 5 8 10 15 20
		
		Arrays.sort(arr);
		int totalLen = arr.length;
		
		int secondLargest=arr[totalLen-2];
		System.out.println("Second largest element is "+ secondLargest);
	}

}
