package java8.features.finterface;

import java.util.List;

import java.util.function.Consumer;
import java8.features.repo.*;
public class ConsumerPersonExample {
	static List<Person> list = PersonRepository.getAllPersons();
	static Consumer<Person> c1 = (list1) -> System.out.println(list1);
	
	static Consumer<Person> c2 = per -> System.out.println(per.getName().toUpperCase());
	

	public static void main(String[] args) {
		printWithCondition();
	}
	
	static void printWithCondition() {
		list.forEach(per ->{
			if(per.getGender().equalsIgnoreCase("Male") && per.getHeight()>=140) {
				c1.andThen(c2).accept(per);
			}
		});
	}

}
