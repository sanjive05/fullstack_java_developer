package Bnp;

import java.util.Arrays;
import java.util.List;

public class FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<String>> list = Arrays.asList(
				Arrays.asList("a","v"),
				Arrays.asList("q","x"),
				Arrays.asList("x","n"),
				Arrays.asList("o","p"),
				Arrays.asList("r","w")
				
				);
		list.stream().flatMap(x-> x.stream()).map(x->x.toUpperCase()).forEach(x-> System.out.println(x));

	}

}
