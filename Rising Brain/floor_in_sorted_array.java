public class floor_in_sorted_array {
    public static void main(String[] args) {
        int[] arr={1, 2, 8, 10, 10, 12, 19};
        int x=0;
      System.out.println(floor(arr, x));
    }
    public static int floor(int[] arr, int target){
       int lo=0;
       int hi=arr.length-1;
       int ans=-1;
       while (lo<=hi) {
        int mid=(lo+hi)/2;
        if (arr[mid]<=target) {
            ans=mid;
           lo=mid+1;
        }
        else{
            hi=mid-1;
        }
       }
       return ans;
    }
}
