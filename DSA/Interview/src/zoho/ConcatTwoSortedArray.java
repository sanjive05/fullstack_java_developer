package zoho;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConcatTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr1 = {1, 3, 5, 7};
	     int[] arr2 = {2, 3, 5, 6, 8};
	     int[] merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
	    		 .distinct() 
	    		 .sorted().toArray();
	     System.out.println(Arrays.toString(merged));
	     
	            int[] evenArray =  Arrays.stream(arr2).filter(n-> n%2==0).toArray();
	            System.out.println(Arrays.toString(evenArray));
	            
	    List<String> names = Arrays.asList("Alex", "Bob", "Ankit", "Brian", "Alice");
	    List<String> resultNames = names.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
	    System.out.println(resultNames);
	    
	  

	}

}
