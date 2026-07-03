package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        List<List<Integer>> subArr = new ArrayList<>();
        int[] arr = {-1,0,1,2,-1,-4};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    subArr.add(list);
                }
            }
        }
        System.out.println(subArr);

        for(List<Integer> temp : subArr){
            if(findSum((ArrayList<Integer>) temp)){
                System.out.println(temp);
            }
        }


    }

    static boolean findSum(ArrayList<Integer> list){
        if((list.get(0)+list.get(1)+list.get(2)) ==0 ){
            return true;
        }
        return false;
    }
}
