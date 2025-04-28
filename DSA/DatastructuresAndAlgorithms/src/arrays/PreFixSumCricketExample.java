package arrays;

import java.util.Arrays;

public class PreFixSumCricketExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] runs = {2,4,6,3,11,7,2,8,12,9,10,13};
		
		int[] cumSum = new int[runs.length];
		cumSum[0] = runs[0];
		for(int i=1;i<cumSum.length;i++) {
			cumSum[i] = cumSum[i-1]+runs[i];
		}
		System.out.println(Arrays.toString(cumSum));

	}

}
