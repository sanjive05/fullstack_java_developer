package java8.features.finterface;

import java.util.function.Consumer;
public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
		Consumer<String> c2 = s -> System.out.println(s.toLowerCase());
		
		c1.andThen(c2).accept("Hello");
	}

}
