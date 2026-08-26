public class infinite_coin_comb {
    public static void main(String[] args) {
        int[] arr={2,3,5};
        int rup=8;
        combination(arr,rup,0,"",0);
    }

    public static void combination(int[] arr, int rup, int sum, String ans, int idx) {
        if (sum==rup) {
            System.out.println(ans);
            return;
        }
        if (sum>rup) {
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            combination(arr, rup, sum+arr[i], ans+arr[i], i);
        }
    }
}
