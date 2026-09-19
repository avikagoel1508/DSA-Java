public class max_consecutive_ones {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1};
     System.out.println(maxones(arr));
    }
    public static int maxones(int[] nums){
         int c=0;
         int ans=0;
        for(int i=0;  i<nums.length; i++){
            if(nums[i]==1){
             c++;
            }
            else{
                ans=Math.max(ans, c);
                c=0;
            }
        }
        return Math.max(ans, c);
    }
}
