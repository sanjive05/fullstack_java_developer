package java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

public class StreamSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,4,86,34,23,74,32,21,25,32);
		
		long total = list.stream().filter(x->{
			if(x>50) {
				return true;
			}
			return false;
		}).map(x->{
	
			return x;
		}).count();
		
		System.out.println(total);

	}

}
