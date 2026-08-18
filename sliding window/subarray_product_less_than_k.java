public class subarray_product_less_than_k {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 6 };
        int k = 100;
        System.out.println(product(arr, k));
    }

    public static int product(int[] arr, int k) {
        int p = 1;
        int si = 0;
        int ei = 0;
        int ans = 0;
        while (ei < arr.length) {
            // grow
            p *= arr[ei];

            // shrink
            while (p >= k && si <= ei) {
                p = p / arr[si];
                si++;
            }
            // ans cal
            ans = ans + (ei - si + 1);
            ei++;
        }
        return ans;
    }
}
