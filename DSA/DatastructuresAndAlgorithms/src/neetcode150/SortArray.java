package neetcode150;

import java.util.Arrays;

public class SortArray {
	public static void swap(int[] arr, int start,int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,4,3,5,1,8};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
