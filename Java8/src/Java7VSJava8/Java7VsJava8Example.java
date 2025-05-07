package Java7VSJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java7VsJava8Example {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Sam","Peter","Sanjive","Sam");
		
		List<String> uniqueList = new ArrayList<>();
		
		for(String name : names) {
			if(!(uniqueList.contains(name))) {
				uniqueList.add(name);
			}
		}
		
		System.out.println(uniqueList);
		
		List<String> uniqueList1 = names.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(uniqueList1);
	}
	
	

}
