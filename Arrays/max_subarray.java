public class max_subarray{
    public static void main(String[] args) {
        int[] arr={-2, 1, -3, 4, -1, 2,1,-5,4};
         System.out.println(maxsum(arr));
    }
    public static int maxsum(int[] arr){
        int n=arr.length;
        int ansum=arr[0];
        int sum=0;
        for (int i = 0; i <n ; i++) {
            sum+=arr[i];
            ansum=Math.max(ansum, sum);
             if (sum<0) {
                sum=0;
            }
        }
        return ansum;
    }
}