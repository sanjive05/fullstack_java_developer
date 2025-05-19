package arrays;

public class ScoreString {
	public int scoreOfString(String s) {
        int result = 0;

        int a = 0, b = 0;

        for(int i=0;i<s.length()-1;i++){
            int temp = 0;
            a = s.charAt(i);
            b = s.charAt(i+1);
            temp = a-b;
            temp = temp < 0 ? temp*-1 : temp;
            result +=temp;
           
        }
        return result;
    }

}
