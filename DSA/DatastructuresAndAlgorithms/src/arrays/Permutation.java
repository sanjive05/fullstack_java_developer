package arrays;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "abc";
		char[] A = input.toCharArray();
		
		int n = A.length;
		
		String temp = "";
		
		for(int i=0;i<n;i++) {
			temp = "";
			for(int j=i;j<n;j++) {
				temp+=A[j];
				System.out.println(temp);
			}
		}

	}

}
