 import java.util.*;
public class linear_search {
   

    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
         System.out.println(search(arr, m, n));
    }
	public static int search(int[] arr, int m, int n){
		for(int i=0; i<n; i++){
			if(arr[i]==m){
				return i;
			}
		}
		return -1;
	}
}


