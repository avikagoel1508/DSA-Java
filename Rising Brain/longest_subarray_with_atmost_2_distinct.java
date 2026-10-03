import java.util.*;
public class longest_subarray_with_atmost_2_distinct {
    public static void main(String[] args) {
        int[] arr={0,1,2,2};
     System.out.println(atmostk(arr));
    }
     public static int atmostk(int[] arr){
        HashMap<Integer, Integer> freq=new HashMap<>();
        int left=0;
        int ans=0;
        int l=0;
        for(int right=0; right<arr.length; right++){
            int val=arr[right];
            freq.put(val, freq.getOrDefault(val, 0)+1);
            while(freq.size()>2){
                int r=arr[left];
                int newfreq=freq.get(r)-1;
                
                if(newfreq==0){
                    freq.remove(r);
                }
                else{
                    freq.put(r, newfreq);
                }
                left++;
            }
            l=right-left+1;
            ans=Math.max(ans, l);
        }
        return ans;
    }
}
////////////////////////////////////////////////////////////////////////////////////////////
// Fruit Into Baskets  LEETCODE 904...................................
