public class Max_Sum_Subarray_of_size_K{
    public static void main(String[] args) {
        int[] arr={100, 200, 300, 400};
        int k=2;
        maxsum(arr, k);
    }

    public static void maxsum(int[] arr, int k) {
        int sum=0;
        int ans=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
            ans=sum;
        }
        //grow
        for (int i = k; i < arr.length; i++) {
            sum+=arr[i];
            //shrink
            int idx=Math.abs(k-i);
            sum-=arr[idx];
            //ans
            ans=Math.max(ans, sum);

        }
        System.out.println(ans);
    }
}