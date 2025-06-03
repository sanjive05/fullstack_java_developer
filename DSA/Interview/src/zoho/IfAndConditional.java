package zoho;

public class IfAndConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		
		if(a++>20)
		     a++;
		     a++;
		// System.out.println(a);
		 
		 a =2 ;
		 
		 switch(a) {
		
		 case 1:
			 System.out.println("1");
			 	
		 case 2:
			 System.out.println("2");
			// break;
		 case 3:
			 System.out.println("3");
			// break;
		 default:
	    	 System.out.println("It is default");
	    	 break;
	     
		 }
		 
		 a = 10;
		 int b = 20;
		 boolean c = a++ ==10 | b++ == 20;
		  
		 System.out.println(b);
		 
		System.out.println(c);
		a = 10;
		do
			a++;
		
		    while(a++<11);
		
		System.out.println(a);
		a = 0;
		int sum = 0;
		
		do {
			switch(a) {
			case 1 : sum = sum-10;
			case 2 : sum = sum % 2;
			case 5 : sum = sum+5;
			break;
			default : sum = 0;
			}
			
		}while(a++<10);
		System.out.println(sum+"   "+a );
		
		 a = 10;
		  	
		 System.out.println(a);
	}
	/* 0  0
	 * 1  5
	 * 2  6 
	 * 3  0
	 * 4  0 
	 * 5  5 
	 * 
	 * 
	 * */

}
