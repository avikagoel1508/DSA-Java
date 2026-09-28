public class capacity_to_ship_packages_within_days {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println(shipped(arr, days));
    }
    public static int shipped(int[] arr, int days){
      int lo=0;
      int sum=0;
      int ans=0;
      for(int i=0; i<arr.length; i++){
        sum+=arr[i];
      }
      int hi=sum;
      while(lo<=hi){
        int mid=(lo+hi)/2;
        if(isitpossible(arr, mid, days)==true){
            ans=mid;
            hi=mid-1;
        }
        else{
            lo=mid+1;
        }
      }
      return ans;
    }

    public static boolean isitpossible(int[] arr, int mid, int days){
        int d=1;
        int i=0;
        int wp=0;
        while(i<arr.length){
            if(wp+arr[i]<=mid){
               wp+=arr[i];
               i++;
            }
            else{
                wp=0;
                d++;
            }
              if(d>days){
            return false;
        }
        }
      
        return true;
    }
}
