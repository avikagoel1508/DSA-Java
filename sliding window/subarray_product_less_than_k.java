public class subarray_product_less_than_k {
    public static void main(String[] args) {
        int[] arr={10,5,2,6};
        int k=100;
        product(arr, k);
    }

    public static void product(int[] arr, int k) {
        int p=1;
        int si=0;
        int ei=0;
        
        while (ei<arr.length) {
            //grow
           if (p<k) {
             p*=arr[ei];
             ei++;
           }
           //shrink
           else{
             
           }
        }
    }
}
