import java.util.Scanner;

public class mummy_motivational_speech {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(ltm(arr, n));
    }
    public static boolean ltm(int[][] arr, int n){
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i][j]!=0) {
                    return false;
                }
            }
        }
        return true;
    }
}
