import java.util.Arrays;

public class magnetic_force_between_balls {
    public static void main(String[] args) {
       int[] position = {1,2,3,4,7};
       int m = 3;
         System.out.println(minforce(position, m));
    }
     public static int minforce(int[] position, int m){
        Arrays.sort(position);
        int lo=0;
        int ans=0;
        int hi=position[position.length-1]-position[0];
        while(lo<=hi){
           int mid=(lo+hi)/2;
           if(isitpossible(position, m, mid)==true){
            ans=mid;
            lo=mid+1;
           }
           else{
            hi=mid-1;
           }

        }
        return ans;
    }

    public static boolean isitpossible(int[] position, int m, int mid){
        int ball=1;
        int pos=position[0];
        for(int i=1; i<position.length; i++){
            if(position[i]-pos>=mid){
                ball++;
                pos=position[i];

            }
           if(ball == m){
    return true;
}
        }
        return false;
    }
}
