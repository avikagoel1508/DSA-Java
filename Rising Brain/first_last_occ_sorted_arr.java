public class first_last_occ_sorted_arr {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int a1=firstocc(nums, target);
        int a2=lastocc(nums, target);
        System.out.println(a1+" "+a2);

    }
    public static int firstocc(int[] arr, int target){
        int f=-1;
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target){
                f=mid;
                hi=mid-1;
            }
            else if(arr[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return f;
    }
    public static int lastocc(int[] arr, int target){
        int l=-1;
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target){
                l=mid;
                lo=mid+1;
            }
            else if(arr[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return l;
    }
}
