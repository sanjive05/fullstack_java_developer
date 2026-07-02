package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        List<List<Integer>> subArr = new ArrayList<>();
        int[] arr = {-1,0,1,2,-1,-4};
        int i=0 , j=1;

        for(i=0;i<arr.length;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(arr[i]);
            for(j=i+1;j<arr.length;j++){
                temp.add(arr[j]);
                if(temp.size()==3){
                    subArr.add(temp);
                    temp= new ArrayList<>();
                }
            }
        }
        System.out.println(subArr);


    }
}
