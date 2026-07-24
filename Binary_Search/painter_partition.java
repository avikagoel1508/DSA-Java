public class painter_partition {
    public static void main(String[] args) {
        int[] arr={5,10, 30, 20, 15};
        int k=3;
         System.out.println(partition(arr, k));
    }
    public static int partition(int[] arr, int k){
        int lo=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int hi=sum;
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isitpossible(arr, k, mid)==true){
                ans=mid;
                hi=mid-1;

            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] arr, int k, int mid) {
        int painter=1;
         int wallpainted=0;
         int i=0;
         while (i<arr.length) {
            if (wallpainted+arr[i]<=mid) {
                wallpainted+=arr[i];
                i++;
            }
            else{
                wallpainted=0;
                painter++;
            }
            if (painter>k) {
                return false;
            }
         }
         return true;
    }
    
}
