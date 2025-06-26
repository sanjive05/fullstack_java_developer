package Bnp;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,2,3,1,3,4,5,6);
		list.stream().peek(System.out::println);
		list.stream().distinct().forEach(System.out::println);
		
		TreeMap<Integer,Integer> tree = new TreeMap<>();
		tree.put(-323423, null);
		tree.put(1, 434);
		tree.put(3,2323);
		tree.put(2, 656);
		tree.put(7, 2323);
		tree.put(5, 2312);
		tree.put(-323423, null);
		tree.put(-323423, null);
		tree.put(-323423, null);
		Map<Integer,Integer> map = tree.descendingMap();
		System.out.println(map);
		System.out.println(tree);
		              
	}
	

}
