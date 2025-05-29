package zoho;

import java.util.Arrays;

public class OperatorPrecedencce {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		 int a = 10, b =20;
		    a = ++a + a++;
		    
		    b = ++a + b++;
		    
		    System.out.printf("a = %d b = %d\n",a,b);
		    
		    int[] arr = {1,2,3,4,5};
		    int i=0;
		    arr[++i]++;
		    System.out.println(Arrays.toString(arr));


	}

}
