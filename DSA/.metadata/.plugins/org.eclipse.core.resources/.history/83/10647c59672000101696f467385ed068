package corejava;

import java.util.Arrays;

public class JailDoorProblem {
	public static void main(String[] args) {
		int[] arr = new int[101];
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j<arr.length;j+=i) {
				System.out.println(j);
				arr[j] = arr[j]==0 ? 1:0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
