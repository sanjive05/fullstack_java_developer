package Java7VSJava8;

import java.util.stream.IntStream;

public class Java7VsJava8Example1 {

	public static void main(String[] args) {
		// 
		
		int total = 0;
		
		for(int i=0;i<=50;i++) {
			total+= i ;
		}
		System.out.println("Before Java 8 : "+total);
		
		int total1 = IntStream.range(0, 51).sum();
		
		System.out.println("After Java 8 : "+total1);
	}
	

}
