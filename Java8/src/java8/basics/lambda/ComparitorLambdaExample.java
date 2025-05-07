package java8.basics.lambda;

import java.util.Comparator;

public class ComparitorLambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Before 
		Comparator<Integer> compare = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		};
		Comparator<Integer> compare1 = (a,b) -> a.compareTo(b);
		
		
		System.out.println(compare1.compare(4, 4));
		
		

	}

}
