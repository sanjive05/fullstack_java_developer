package java8.features.streams;

import java.util.Arrays;
import java.util.List;

public class EmployeeStreamQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = Arrays.asList(new Employee("Sanjive",23,"CCD"),new Employee("Robert",30,"Accounts"),
				new Employee("Pradeep",24,"Accounts"),new Employee("Hariharan",27,"ADM"));
		
		list.stream().filter(e->e.getAge()>25).forEach(e->System.out.println(e.getAge()));
		
		list.stream().map(e -> e.getName().toUpperCase()).forEach(e->System.out.println(e));

	}

}
