public class sort_color {
    public static void main(String[] args) {
        int[] nums={0,2,1,0,1,2};
        sortColors(nums);
    }
     public static void sortColors(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int idx=minidx(nums, i);
            int temp=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp;
        }
    }
    public static int minidx(int[] arr, int i){
        int mini=i;
         for(int j=i+1; j<arr.length; j++){
            if(arr[j]<arr[mini]){
                mini=j;
            }
         }
         return mini;
    }
}
