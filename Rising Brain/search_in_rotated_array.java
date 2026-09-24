public class search_in_rotated_array{
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
         System.out.println(find(arr, target));
    }
     public static int find(int[] arr, int target){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target){
                return mid;
            }
           //left sorted
           else if (arr[lo]<=arr[mid]) {
            if(target>=arr[lo] && target<arr[mid]){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }

           }
           //right sorted
           else{
             if(target>arr[mid] && target<=arr[hi]){
                lo=mid+1;
             }
             else{
                hi=mid-1;
             }
           }
        }
        return -1;
    }
}