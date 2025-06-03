package Bnp;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Grouping {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Sanjive",22,"CCD"),
				new Employee("Hariharan",27,"ADM"),
				new Employee("Robert",30,"Finance"),
				new Employee("Surendar",26,"Testing"),
				new Employee("Pradeep",22,"Finance")
				);
		Map<Integer, List<Employee>> map= list.stream().collect(Collectors.groupingBy(emp -> emp.getAge()));
		
		String a = "ABCABCAAC";
		
	    for(Entry<Integer, List<Employee>> e : map.entrySet()) {
	    	System.out.print(e.getKey()+"  ");
	    	
	    	e.getValue().stream().forEach(c-> System.out.println(c.getName()));
	    	
	    }
		System.out.println(map);
	}

}
