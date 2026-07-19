import java.util.Arrays;

public class sum_pair {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,2};
        int target=5;
        pair(arr, target);
    }
    public static void pair(int[] arr, int target){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while (i<j) {
            if (arr[i]+arr[j]==target) {
                System.out.println(arr[i] + " and " + arr[j] );
                i++;
                j--;
            }
            else if (arr[i]+arr[j]>target) {
                j--;

            }
            else{
                i++;
            }
        }
    }
}
