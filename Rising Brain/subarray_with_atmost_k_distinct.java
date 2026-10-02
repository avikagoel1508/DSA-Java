import java.util.*;
public class subarray_with_atmost_k_distinct {
    public static void main(String[] args) {
        int[] arr={1,2,2,3};
        int k=2;
          System.out.println(atmostk(arr, k));
    }
    public static int atmostk(int[] arr, int k){
       HashMap<Integer, Integer> freq=new HashMap<>();
       int left=0;
       int ans=0;
       //grow.............................................................................
       for (int right = 0; right < arr.length; right++) {
        int val=arr[right];
         freq.put(val, freq.getOrDefault(val, 0)+1);

         //shrink.....................................................................................
         while (freq.size()>k) {
            int remove=arr[left];
            int newfreq=freq.get(remove)-1;

            if (newfreq==0) {
                freq.remove(remove);
            }
            else{
                freq.put(remove, newfreq);
            }
            left++;
         }

       // ans calc............................................................................................
       ans+=right-left+1;
       }
       return ans;
    }
}
