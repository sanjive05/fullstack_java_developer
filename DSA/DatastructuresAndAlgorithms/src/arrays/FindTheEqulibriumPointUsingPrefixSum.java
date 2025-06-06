package arrays;

import java.util.Arrays;

public class FindTheEqulibriumPointUsingPrefixSum {
	public static void main(String[] args) {
		int[] arr = {-7,1,5,2,-4,3,0};
		int[] preSum = new int[arr.length];
		
		preSum[0] = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			preSum[i] = preSum[i-1]+arr[i];
		}
		// Let me calculate left and right sum with this prefix sum
		
		for(int i=0;i<arr.length;i++) {
			int leftSum = preSum[i]-arr[i];
			int rightSum = preSum[arr.length-1] -preSum[i];
			
			if(leftSum == rightSum) {
				System.out.println("The equalibrium point is  : "+i);
			}
			
		}
		System.out.println(Arrays.toString(preSum));
	}

}
