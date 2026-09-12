public class twosumII{
public static void main(String[] args) {
    int[] arr={2,7,11,15};
    int target=9;
      int[] ans=twosum(arr, target);
      for (int i = 0; i < ans.length; i++) {
        System.out.print(ans[i]+" ");
      }
}
public static int[] twosum(int[] arr, int target){
    int [] ans=new int[2];
    int i=0;
    int j=arr.length-1;
    while (i<j) {
        if (arr[i]+arr[j]>target) {
            j--;
        }
        else if (arr[i]+arr[j]<target) {
            i++;
        }
        else{
            ans[0]=i+1;
            ans[1]=j+1;
            break;
        }
    }
    return ans;
}
}