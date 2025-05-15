package methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Sample{
	static void print(String s) {
		System.out.println(s);
	}
}

public class MethodRefExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Alice", "Bob", "Charlie","Bob"};
		
				
	   Arrays.stream(names).map(x->x.toUpperCase()).collect(Collectors.groupingBy(x-> x,Collectors.counting()));

	}

}
