package javapracticenumberbased;

public class Armstrong {

	public static void main(String[] args) {
		
		int num=153; // 9800817
		int temp=num;
		double sum=0;
		
		int length= String.valueOf(num).length();
		
		while(num>0) {
			int digit=num%10;
			sum=sum+(Math.pow(digit, length));
			num=num/10;
		}
		
		System.out.println((temp==sum)? "Armstrong":"Not Armstrong");

	}

}
