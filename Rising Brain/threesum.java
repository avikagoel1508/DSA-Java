import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum{
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        int target=0;
         List<Integer>ll=new  ArrayList<>();
         List<List<Integer>>ans=new ArrayList<>();
         System.out.println(sum(arr, target, ll, ans));
    }
    public static List<List<Integer>> sum(int[] arr, int target, List<Integer>ll,  List<List<Integer>>ans){
        Arrays.sort(arr);
         for (int i = 0; i < arr.length-2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
    continue;
}
            int j=i+1;
            int k=arr.length-1;
            while (j<k) {
                if (arr[i]+arr[j]+arr[k]>target) {
                    k--;
                }
               else if (arr[i]+arr[j]+arr[k]<target) {
                    j++;
                }
                else{
                    ll.clear();
                   ll.add(arr[i]);
                   ll.add(arr[j]);
                   ll.add(arr[k]);
                   ans.add(new ArrayList<>(ll));
                   
                    j++;
                    k--;
                     while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }

                    // Skip duplicate k
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }
            }
          
         }
         return ans;
    }
}