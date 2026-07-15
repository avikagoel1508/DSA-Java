public class rain_water_trapping {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
       System.out.println(trap(arr));
    }
    public static int trap(int[] nums){
     int n =nums.length;
     int sum=0;
     int[] lm=new int[n];
     int[] rm=new int[n];
     lm[0]=nums[0];
     for (int i = 1; i < n; i++) {
        lm[i]=Math.max(lm[i-1], nums[i]);
     }
     rm[n-1]=nums[n-1];
     for (int i = n-2; i>=0; i--) {
        rm[i]=Math.max(rm[i+1], nums[i]);
     }
     for (int i = 0; i < rm.length; i++) {
       sum+=Math.abs(Math.min(lm[i], rm[i])- nums[i]); 
     }
     return sum;
    }
}
