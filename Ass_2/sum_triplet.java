import java.util.Arrays;

public class sum_triplet{
    public static void main(String[] args) {
        int[] arr={5,7,9,1,2,4,6,8,3};
         int target=10;
         triplet(arr, target);
    }
    public static void triplet(int[] arr, int target){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int j=i+1;
            int k=arr.length-1;
            while (j<k) {
                if (arr[i]+arr[j]+arr[k]==target) {
                    System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                    j++;
                    k--;
                }
                else if (arr[i]+arr[j]+arr[k]>target) {
                    k--;
                }
                else{
                    j++;
                }
            }
        }
    }
}