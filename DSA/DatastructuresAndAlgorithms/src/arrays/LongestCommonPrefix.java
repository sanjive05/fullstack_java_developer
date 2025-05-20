package arrays;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		
        String output = "" ,s1 = "" ,s2="";
        if(strs.length  <=1 ) {
        	return output;
        }
        
        for(int i=0;i<strs[0].length();i++) {
        	for(int j=0;j<strs.length;j++) {
        		
        	}
        }
        
        return output;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"flower","flow","flight"};
		
		System.out.println(longestCommonPrefix(strs));
	}
}
