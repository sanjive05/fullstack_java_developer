package zoho;

import java.util.ArrayList;
import java.util.List;

public class DecendingOrder {
	 public static void swap(List<Integer> arr ,int start, int end){
         int temp = arr.get(start);
		 arr.set(start,arr.get(end));
		 arr.set(end,temp);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		 list.add(5);
		 list.add(22);
		 list.add(1);
		 list.add(4);
		 list.add(8);
		 list.add(2);
		 // 5 1 4 8 
		 for(int i=0;i<list.size();i++){
		      int temp = list.get(i);
		      for(int j=i+1;j<list.size();j++){
			      if(temp< list.get(j)){
				      swap(list,i,j);
				      temp = list.get(i);
				      System.out.println(list);
				  }
				
		 }
		

	}
		 System.out.println(list);
	}

}
