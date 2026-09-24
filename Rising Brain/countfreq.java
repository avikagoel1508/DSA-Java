public class countfreq {
    public static void main(String[] args) {
        int[] arr={10,11};
        int target=10;
        int a1=firstocc(arr, target);
       int a2=lastocc(arr, target);
       if(a1==-1 && a2==-1){
           System.out.println(0);
           return;
       }
       int ans=a2-a1+1;
       System.out.println(ans);
    }
    public static int firstocc(int[] arr, int target){
         int lo=0;
        int hi=arr.length-1;
        int f=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
               f=mid;
               hi=mid-1;
               
            }
            else if(arr[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return f;
    }
    public static int lastocc(int[] arr, int target){
         int lo=0;
        int hi=arr.length-1;
        int l=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
               l=mid;
               lo=mid+1;
               
            }
            else if(arr[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return l;
    }
}
