package arrays;

public class BinarySearch {
	
	public static int search(int[] arr,int target) {
		int start = 0, end = arr.length-1,mid = 0;
		while(start<=end) {
			mid = (start+end)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				mid = start+1;
			}
			else {
				mid = end -1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,7,12,15,17,19};
		
		int target = 12;
		
		System.out.println(search(arr,target));
		

	}

}
