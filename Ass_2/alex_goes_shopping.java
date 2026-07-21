import java.util.*;
public class alex_goes_shopping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
			
		}
        int q=sc.nextInt();
        for(int j=0; j<q; j++){
            int a=sc.nextInt();
            int k=sc.nextInt();
             int c=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]<=a && a%arr[i]==0) {
                 c++;
            }
        }
        if (c>=k) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    }
}
