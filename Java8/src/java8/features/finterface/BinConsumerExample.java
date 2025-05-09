package java8.features.finterface;

import java.util.function.BiConsumer;

public class BinConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiConsumer<Integer,Integer> add = (a,b) -> System.out.println(a+b);
		
		BiConsumer<Integer,Integer> sub = (a,b) -> System.out.println(a-b);
		
		BiConsumer<Integer,Integer> multi = (a,b) -> System.out.println(a*b);
		
		add.andThen(sub).andThen(multi).accept(4, 8);
 
	}

}
