public class allocate_min_pages {
    public static void main(String[] args) {
        int[] arr={12, 34, 67, 90};
        int k=2;
        System.out.println(minpages(arr, k));

    }
    public static int minpages(int[] arr, int k){
        int ans=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int lo=0;
        int hi=sum;
        while (lo<=hi) {
            int mid=(lo+hi)/2;
            if (isvalid(arr, k, mid)==true) {
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public  static boolean isvalid(int[] arr, int k, int mid) {
            int s=1;
            int readpages=0;
            int i = 0; 
            while (i < arr.length) {
                if (readpages+arr[i]<=mid) {
                     readpages+=arr[i];
                     i++;
                    
                }
                else{
                    s++;
                    readpages=0;
                }
            }
            if (s>k) {
                return false;
            }
            return true;
    }
}
