package arrays;

public class GeneratingSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,6,4,8,3,1,9};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum = 0;
				for(int k=i;k<j;k++) {
					sum+= arr[k];
					System.out.print(arr[k]+" ") ;
				}
				System.out.print("sum  " +sum);
				System.out.println();
				
			}
			
			
		}

	}

}
