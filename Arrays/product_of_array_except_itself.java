public class product_of_array_except_itself {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
         int[] ans=product(arr);
         for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] +"  ");
         }
          
    }
    public static int[] product(int[]arr){
        int n=arr.length;
        int[] lp=new int[n];
        int[] rp=new int[n];
        lp[0]=1;
        rp[n-1]=1;
        for (int i = 1; i < n; i++) {
            lp[i]=lp[i-1]*arr[i-1];
        }
        for(int i=n-2; i>=0; i--){
            rp[i]=rp[i+1]*arr[i+1];
        }
        for(int i =0; i<n; i++){
            lp[i]=lp[i]*rp[i];
        }
        return lp;
    }
}
