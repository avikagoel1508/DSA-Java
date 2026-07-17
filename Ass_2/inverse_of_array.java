public class inverse_of_array{
    public static void main(String[] args) {
        int[] arr={0,2,4,1,3};
    inverse(arr);
    }
    public static void inverse(int[] arr){
        int [] ans=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
            ans[temp]=i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}