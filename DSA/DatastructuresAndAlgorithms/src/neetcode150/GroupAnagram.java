package neetcode150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		String[] sortedArr = new String[strs.length];
		HashMap<String,List<String>> hash = new HashMap<>();
		for(int i=0;i<strs.length;i++) {
			char[] charArr = strs[i].toCharArray();
			Arrays.sort(charArr);
			sortedArr[i]= new String(charArr);
		}
		
		for(int i=0;i<sortedArr.length;i++) {
			if(hash.containsKey(sortedArr[i])) {
				hash.get(sortedArr[i]).add(strs[i]);
			}
			else {
				hash.put(sortedArr[i], new ArrayList<>());
				hash.get(sortedArr[i]).add(strs[i]);
				
			}
		}
		System.out.println(hash 	);
		

	}

}
