public class max_cons_ones_III {
    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(con_ones(arr, k));
    }
    public static int con_ones(int[]arr, int k){
       int si=0;
       int ei=0;
       int ans=0;
       int flip=0;
       //grow
       while(ei<arr.length && si<=ei){
        if (arr[ei]==0) {
            flip++;
        }
        
        //shrink
        while (flip>k && si<=ei) {
            if (arr[si]==0) {
                flip--;
            }
            si++;
        }
        //ans cal
        ans=Math.max(ans, ei-si+1);
       ei++;
       }
       return ans;
    }
}
