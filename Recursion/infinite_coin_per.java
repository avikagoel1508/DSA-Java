public class infinite_coin_per {
    public static void main(String[] args) {
        int[] arr={2,3,5};
        int rup=8;
        permutation(arr,rup,0,"");
    }

    public static void permutation(int[] arr, int rup, int sum, String ans) {
        if (sum==rup) {
            System.out.println(ans);
            return;
        }
        if (sum>rup) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            permutation(arr, rup, sum+arr[i], ans+arr[i]);
        }
    }
}
