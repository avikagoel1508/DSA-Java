public class aggresive_cows{
public static void main(String[] args) {
    int[] stalls={1,2,4,8,9};
    int c=3;
     System.out.println(largest_min_dist(stalls, c));
}
public static int largest_min_dist(int[] stalls, int c ){
    int lo=0;
    int hi=stalls[stalls.length-1]-stalls[0];
    int ans=0;
    while(lo<=hi){
        int mid=(lo+hi)/2;
        if(isitpossible(stalls, c, mid)==true){
            ans=mid;
            lo=mid+1;
        }
        else{
            hi=mid-1;
        }
    }
    return ans;
}
public static boolean isitpossible(int[] stalls, int c, int mid) {
    // TODO Auto-generated method stub
    int cow=1;
    int pos=stalls[0];
    for (int i = 1; i < stalls.length; i++) {
        if(stalls[i]-pos>=mid){
            cow++;
            pos=stalls[i];
        }
         if (cow==c) {
        return true;
    }
    }
   
    return false;
}
}