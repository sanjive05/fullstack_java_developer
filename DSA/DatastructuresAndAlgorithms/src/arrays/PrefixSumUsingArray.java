package arrays;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.*;
public class PrefixSumUsingArray {

	public static void main(String[] args) {
		int[] runs = {0,2,4,6,3,12,8,7,11,9,10,7};
		int[] cumSum = new int[runs.length];
		List<List<Integer>> quaries = new ArrayList<>();
		quaries.add(Arrays.asList(1,4));
		quaries.add(Arrays.asList(1,5));
		quaries.add(Arrays.asList(6,8));
		quaries.add(Arrays.asList(3,6));
		quaries.add(Arrays.asList(1,4));
		
		
		for(int i=1;i<runs.length;i++) {
			cumSum[i] = cumSum[i-1]+runs[i];
		}
		
		for(int i=0;i<quaries.size();i++) {
			int index0 = quaries.get(i).get(0) ,index1 = quaries.get(i).get(1);
			if(index0==0) {
				System.out.println("Runs between "+index0+ " and  "+index1 +" is " + (cumSum[index1]));
			}
			else {
			System.out.println("Runs between "+index0+ " and  "+index1 +" is " + (cumSum[index1]-cumSum[index0-1]));
			}
		}
		

	}

}
