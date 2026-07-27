import java.util.Arrays;

public class koko_eating_bananas{
    public static void main(String[] args) {
        int[] piles={3,6,7,11};
        int h=8;
         System.out.println(minhrs(piles, h));
    }
    public static int minhrs(int[] piles, int h){
       
        int lo=1;
        int hi = 0;
for (int x : piles)
    hi = Math.max(hi, x);
        int ans=0;
        while (lo<=hi) {
            int mid=lo+(hi-lo)/2;
            if (isitpossible(piles, h, mid)==true) {
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] piles, int h, int mid) {
        long hrs=0;
        for (int i = 0; i < piles.length; i++) {
                hrs+=(piles[i] + mid - 1) / mid;
            
        }

        if (hrs<=h) {
                return true;
            }
        return false;
    }
}