package arrays;

public class FindTheLastDigitOfBiggestNumber {

	public static void main(String[] args) {
		
		// Reverse a number 
		int n = 343432;
		
		int temp = n;
		int reverse = 0;
		while(temp>0) {
			reverse += (temp%10);
			reverse *=10;
			temp /=10;
		}
		System.out.println(reverse);
	}

}
