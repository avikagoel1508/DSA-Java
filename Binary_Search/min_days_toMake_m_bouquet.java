public class min_days_toMake_m_bouquet {
    public static void main(String[] args) {
        int[] arr={5, 5, 5, 5, 10, 5, 5};
        int m=2;
        int k=3;
       
       
        System.out.println(mindays(arr, m, k));
    }
    public static int mindays(int[] arr, int m, int k){
         if((long)m*k>arr.length){
            return -1;
        }
        int lo = arr[0];
        for (int x : arr) {
        lo = Math.min(lo, x);
}
         int hi = arr[0];
         for (int x : arr) {
        hi = Math.max(hi, x);
}
        int ans=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if (isitpossible(arr, m, k, mid)==true) {
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
          return ans;
    }
    public static boolean isitpossible(int[] arr, int m, int k, int mid) {
          int b=0;
          int c=0;
          for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=mid) {
                c++;
                if (c==k) {
                    b+=1;
                    c=0;
                }
            }
            else{
                c=0;
            }
          }
          if (b>=m) {
            return true;
          }
          return false;
    }
}
