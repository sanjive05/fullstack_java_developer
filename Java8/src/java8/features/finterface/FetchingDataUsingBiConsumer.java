package java8.features.finterface;

import java.util.List;
import java.util.function.Consumer;

import java.util.function.BiConsumer;
import java8.features.repo.*;
public class FetchingDataUsingBiConsumer {
	static List<Person> list = PersonRepository.getAllPersons();
	static Consumer<Person> c1 = (list1) -> System.out.println(list1);
	
	static Consumer<Person> c2 = per -> System.out.println(per.getName().toUpperCase());
	
	static BiConsumer<String,List<String>> hobbies = (name,hobbies) -> {
		System.out.println(name +"   "+ hobbies);
	};

	public static void main(String[] args) {
		fetchHobbies();
		
	}
	static void fetchHobbies() {
		list.forEach((per) -> {
			hobbies.accept(per.getName(),per.getHobbies() );
		});
	}

}
