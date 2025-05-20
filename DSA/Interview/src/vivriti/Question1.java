package vivriti;

import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employeeData = Arrays.asList(new Employee("Sanjive",23,"CCD"),
				new Employee("Preetham",30,"SAM")
				,new Employee("Chandru",26,"ISG")
				);
		
		
		employeeData.stream().map(x-> x.getName().toUpperCase()).forEach(x->System.out.println(x));
		

	}

}
