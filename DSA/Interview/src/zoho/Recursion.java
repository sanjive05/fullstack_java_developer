package zoho;

public class Recursion {

	public static void main(String[] args) {
		
		int a = 3 , b = 3, c = 4, d = 4;
		
		if(++a>b && c<++d) {
			System.out.println("Yes its true...");
		}
		
		System.out.printf("a  = %d  b = %d  c = %d   d = %d",a,b,c,d);
		
	

	}

	private static void fun(int a) {
		if(a>0) {
			fun(--a);
			System.out.println(a);
			fun(--a);
		}
		
	}

}
