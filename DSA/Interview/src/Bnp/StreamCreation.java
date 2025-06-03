package Bnp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] arr = {1.21f,3.3f,4.4f,3.3f,45.7f,23.2f,34.8f};
		
		int[] intArr = {1,3,5,56,33,2,36,3,12,7,4};
		Stream<Float> s=IntStream.range(0, arr.length).mapToObj(o -> arr[o]);
		
		String a = "AABCBA";
		
		Stream<Character> stream = IntStream.range(0, a.length()).mapToObj(x-> a.charAt(x)); 
		
		Arrays.stream(intArr).filter(x->x%2==0).forEach(System.out::println);
		
		List<String> names = Arrays.asList("Sanjive","Chandru","Sugumar","Hariharan");
		System.out.println(names);
		names = names.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(names);
		
		int sum = Arrays.stream(intArr).reduce(0,(x,y)->x+y);
		
		System.out.println(sum);
	}

}
