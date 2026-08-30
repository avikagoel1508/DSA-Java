public class murthal_parantha{
    public static void main(String[] args) {
        int p=10;
        int cook=4;
        int[] rank={1,2,3,4};

    }
    public static int parantha(int p, int cook, int [] rank){
        int lo=0;
        int hi=55;
        int ans=0;
        while (lo<=hi) {
            int mid=(lo+hi)/2;
            if (isitpossible(p, cook, rank, mid)==true) {
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
       return ans;
    }
    public static boolean isitpossible(int p, int cook, int[] rank, int mid) {
        int par=0;
        int tt=0;
        if (tt<mid) {
            tt+=
        }
    }
    
}