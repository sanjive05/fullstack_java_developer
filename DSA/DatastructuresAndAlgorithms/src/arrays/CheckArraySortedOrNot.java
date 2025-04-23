package arrays;

public class CheckArraySortedOrNot {
	
	public static boolean isSorted(int[] arr) {
		
		int increaseCount = 0;
		int decreaseCount = 0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				increaseCount++;
			}
			else {
				decreaseCount++;
			}
		}
		if(increaseCount ==0 || decreaseCount==0) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,9,8,7,6,3,4,3,2,1}; 
		
		System.out.println(isSorted(arr));

	}

}
