package logicprograms;

import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[] args) {
		 int[] arr= {3,4,1,5,7,2};
		 
		 Arrays.sort(arr);
		 int totalLen = arr.length;
		 for(int i=0; i<totalLen; i++) {
			 if((i+1)!=arr[i]) {
				 System.out.println("Missing element is "+(i+1));
				 break;
			 }
		 }
	}

}
