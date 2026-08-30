public class missing_num {
    public static void main(String[] args) {
        int[] arr={3,0,1};
     System.out.println(missing(arr));
    }
    public static int missing(int[] arr){
        int ts=0;
        int sum=0;
        for (int i = 0; i <= arr.length; i++) {
            ts+=i;
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return ts-sum;
    }
}
