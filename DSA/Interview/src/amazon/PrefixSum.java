package amazon;
/*
Q1. Due to some construction, deforestation and afforestation is being carried out in the neighboring areas. 
Deforestation is represented by negative integers and afforestation is represented by positive integers for each neighborhood. 
Determine whether there exists a region (combination of neighborhoods) where the number of trees remained the same after construction.

Input: { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
Output: 

{ 3, 4, -7 }
{ 4, -7, 3 }
{ -7, 3, 1, 3 }
{ 3, 1, -4 }
{ 3, 1, 3, 1, -4, -2, -2 }
{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }

 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 
 
 3  7   0  3  4  7  8   4   2   0 

<PrefixData, Index> 

*/

import java.util.HashMap;

public class PrefixSum{
    public static void print(int start,int end,int[] arr){
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args){
        
        int[] arr = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        HashMap<Integer,Integer> hash = new HashMap<>();
        
        hash.put(0,0);
        int sum = 0; 
        
        for(int i=0;i<arr.length;i++){
            sum+= arr[i];
            if(!hash.containsKey(sum)) {
                hash.put(sum,i);
            }

        }
        sum = 0;
        
        //  3  7   0  3  4  7  8   4   2   0 
        
        //  0  1   2  3  4  5  6   7   8   9
       // System.out.println(hash);
        
        for(int i=0;i<arr.length;i++){
            sum+= arr[i];                     
            if(sum == 0){
                print(0,i,arr);
            }
            else if (hash.containsKey(sum)){
                print(hash.get(sum)+1,i,arr);
            }
        }
        
    }
    
}