public class split_array_largest_sum {
    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        int k=2;

    System.out.println(largestsum(arr, k));
    }
    public static int largestsum(int[] arr, int k){
        int lo=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int hi=sum;
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isitpossible(arr, k, mid)==true){
                ans=mid;
                hi=mid-1;

            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] arr, int k, int mid) {
        int t=1;
         int as=0;
         int i=0;
         while (i<arr.length) {
            if (as+arr[i]<=mid) {
                as+=arr[i];
                i++;
            }
            else{
                as=0;
                t++;
            }
            if (t>k) {
                return false;
            }
         }
         return true;
    }
}
