public class rain_water_trapping {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapping(arr));
    }
     public static int trapping(int[] arr){
        int n=arr.length;
        int sum=0;
        int[] l=new int[n];
        l[0]=arr[0];
        int[] r=new int[n];
        r[n-1]=arr[n-1];
        for(int i=1; i<n; i++){
            l[i]=Math.max(l[i-1], arr[i]);
        }
        for(int i=n-2; i>=0; i--){
            r[i]=Math.max(r[i+1], arr[i]);
        }
        for(int i=0; i<n; i++){
          sum+=Math.min(l[i], r[i])-arr[i];
        }
        return sum;
    }
}
