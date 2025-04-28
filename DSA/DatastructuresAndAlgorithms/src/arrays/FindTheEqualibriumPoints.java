package arrays;

import java.util.Arrays;

public class FindTheEqualibriumPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-7,1,5,2,-4,3,0};
		
		int[] left =  new int[arr.length], right = new int[arr.length];
		left [0] = 0;
		right[arr.length-1] = 0;
		
		for(int i=1;i<arr.length;i++) {
			left[i] = left[i-1]+ arr[i-1];
		}
		for(int i=arr.length-2;i>=0;i--) {
			right[i]= right[i+1] + arr[i+1];
		}
		for(int i=0;i<arr.length;i++) {
			if(left[i]==right[i]) {
				System.out.println("Equlibrium point is : " +i);
			}
		}

	}

}
