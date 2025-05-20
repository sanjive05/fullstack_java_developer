package arrays;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
	 public static int[] replaceElements(int[] arr) {
	        int big = -1;
	       
	        for(int i=arr.length-1;i>=0;i--){
	            int temp = arr[i];
	            arr[i] = big;
	            big = temp>big ?temp : big;
	        }
	        return arr;
	    }

	public static void main(String[] args) {
		int[] arr = {17,18,5,4,6,1};
		System.out.println(Arrays.toString(replaceElements(arr)));
	}

}
