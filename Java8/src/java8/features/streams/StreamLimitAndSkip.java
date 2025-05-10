package java8.features.streams;

import java.util.Arrays;
import java.util.List;

public class StreamLimitAndSkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,4,86,34,23,74,32,21,25,32);
		
		list.stream().limit(2).forEach(x->System.out.println(x));
	}

}
