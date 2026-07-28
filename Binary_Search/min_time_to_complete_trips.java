public class min_time_to_complete_trips {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int totaltrips=5;
         System.out.println(mintime(arr, totaltrips));
    }
    public static int mintime(int[] arr, int totaltrips){
         int mint = arr[0];
        for (int x : arr) {
        mint = Math.min(mint, x);
}
         int lo=mint;
        int hi=mint*totaltrips;
        int ans=0;
        while (lo<=hi) {
            int mid=(lo+hi)/2;
            if (isitpossible(arr, totaltrips, mid)==true) {
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] arr, int totaltrips, int mid) {
        int trips=0;
        for (int i = 0; i < arr.length; i++) {
           trips+=mid/arr[i];
        }
        if (trips>=totaltrips) {
            return true;
        }
        return false;
    }
}
