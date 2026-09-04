import java.util.ArrayList;
import java.util.List;

public class Permutation_2 {
     public static void main(String[] args) {
        int[] arr={1,1,3};
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
         permute(arr, 0, ll, ans);
           System.out.println(ans);

    }
    public static void permute(int[] arr, int i, List<Integer> ll, List<List<Integer>> ans){
        
        if (i==arr.length) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int j = i; j < arr.length; j++) {
            boolean val=true;
            for (int k = i; k < j; k++) {
                if (arr[k]==arr[j]) {
                     val=false;
                     break;
                }
               
            }
            if (val==true) {    
           swap(arr,i,j);
            ll.add(arr[i]);
            permute(arr, i + 1,ll, ans);
            swap(arr, i, j);
            ll.remove(ll.size()-1);
            }
        }
        
    }
    public static void swap(int[] arr, int i, int j) {
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }
}
