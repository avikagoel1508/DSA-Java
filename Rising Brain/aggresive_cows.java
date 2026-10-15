import java.util.Arrays;

public class aggresive_cows {
    public static void main(String[] args) {
        int[] arr={1, 2, 4, 8, 9};
        int k=3;
        System.out.println(mincows(arr, k));

    }
    public static int mincows(int[] arr, int k){
        int n=arr.length;
        Arrays.sort(arr);
        int lo=1;
        int hi=arr[n-1]-arr[0];
        int ans=0;
        while (lo<=hi) {
            int mid=(lo+hi)/2;
            if (isvalid(arr,k, mid)==true) {
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
    public static boolean isvalid(int[] arr, int k, int mid){
        int c=1;
        int pos=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]-pos>=mid) {
                c++;
                pos=arr[i];
            } 
        }
        if (c>=k) {
            return true;
        }
        return false;
    }
}
