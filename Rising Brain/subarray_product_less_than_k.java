public class subarray_product_less_than_k {
    public static void main(String[] args) {
        int[] arr={10,5,2,6};
        int k=100;
        System.out.println(subarrayproduct(arr, k));
    }
     public static int subarrayproduct(int[] arr, int k) {

    int left = 0;
    int right = 0;
    int p = 1;
    int ans = 0;

    while (right < arr.length) {

        // grow
        p *= arr[right];

        // shrink
        while (p >= k && left <= right) {
            p /= arr[left];
            left++;
        }

        // count
        ans += right - left + 1;

        // move right
        right++;
    }

    return ans;
}
}
