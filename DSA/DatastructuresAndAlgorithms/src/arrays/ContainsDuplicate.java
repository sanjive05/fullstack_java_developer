package arrays;

import java.util.HashSet;

public class ContainsDuplicate {
	 public static boolean hasDuplicate(int[] nums) {
		   boolean result = false;
		   HashSet<Integer> set = new HashSet<>();
		   for(int i=0;i<nums.length;i++) {
			   if(set.add(nums[i])) {
				   continue;
			   }
			   else {
				   return true;
			   }
		   }
		   return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,2};
		
		System.out.println(hasDuplicate(arr));
	}

}
