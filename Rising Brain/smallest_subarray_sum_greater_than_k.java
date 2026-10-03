public class smallest_subarray_sum_greater_than_k {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int x=7;
        System.out.println(smallestsubarray(x, arr));
    }
    public static int smallestsubarray(int x, int[] arr){
        int left=0;
        int l=0;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        for(int right=0; right<arr.length; right++){
            sum+=arr[right];
          while(sum>=x){
              l=right-left+1;
               ans=Math.min(l, ans);
               sum-=arr[left];
              left++;
              
          }
         
        }
        return Math.min(ans, l);
    }
}
