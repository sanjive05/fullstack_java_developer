package arrays;

import java.util.Arrays;

public class ConstructPrefixEvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,-2,4,6,-3,5};
		int[] evenSum = new int[arr.length];
		evenSum[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(i%2 !=0 ) {
				evenSum[i] = evenSum[i-1];
			}
			else {
			evenSum[i] = evenSum[i-1]+arr[i];
			}
		}
		System.out.println(Arrays.toString(evenSum));

	}

}
