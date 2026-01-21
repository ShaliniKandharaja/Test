package javapractice;

public class SwapCharacters {

	public static void main(String[] args) {
		
		String str="abcd";
		char[] arr=str.toCharArray();
		
		char temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		//System.out.println(arr);
		System.out.println(new String(arr));
		
	}

}
