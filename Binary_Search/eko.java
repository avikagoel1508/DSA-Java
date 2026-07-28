import java.util.Scanner;

public class eko{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(minwood(arr, m));
    }
    public static int minwood(int[] arr, int m){
        int lo = 0;
         int hi = arr[0];
         for (int x : arr) {
        hi = Math.max(hi, x);
}
           int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if (isitpossible(arr, m,mid)==true) {
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
          return ans;
    }
    public static boolean isitpossible(int[] arr, int m, int mid) {
      long wood=0;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i]<mid) {
            wood+=0;
        }
        else{
            wood+=arr[i]-mid;
        }
      }
      if (wood>=(long)m) {
        return true;
      }
      return false;
    }
}