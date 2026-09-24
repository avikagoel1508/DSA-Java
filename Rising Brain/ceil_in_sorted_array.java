public class ceil_in_sorted_array {
    public static void main(String[] args) {
        int[] arr={1, 2, 8, 10, 11, 12, 19};
        int target=20;
  System.out.println(ceil(arr, target));
    }
    public static int ceil(int[] arr, int target){
        int lo=0;
        int hi=arr.length-1;
        int ans=-1;
        while (lo<=hi) {
            int mid=(lo+hi)/2;
            if (arr[mid]>=target) {
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
}
