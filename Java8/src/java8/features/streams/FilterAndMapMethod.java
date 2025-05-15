package java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		
		//nums.stream().filter(n -> n%2==0).forEach(x-> System.out.println(x));
		
		List<String> names = Arrays.asList("alice", "bob");
		//names.stream().map(x-> x.toUpperCase()).forEach(x -> System.out.println(x));
		
		List<List<String>> list = Arrays.asList(
			    Arrays.asList("A", "B"),
			    Arrays.asList("C", "D")
			);
		
		
		
		List<String> finalList = list.stream()
		.flatMap(x->x.stream())
		.collect(Collectors.toList());
		
		System.out.println(finalList);
		
	}

}
