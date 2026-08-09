import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        rotate(arr, n);
    }

    public static void rotate(int[][] arr, int n) {
        int[][] crr=new int[n][n];
        int t=n-1;
        for(int i=0; i<n && t>=0; i++){
            for(int j=0; j<n && t>=0; j++){
                crr[i][j]=arr[j][t];
            }
             t--;
        }
          for (int i = 0; i < crr.length; i++) {
            for (int j = 0; j < crr[0].length; j++) {
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
          }
    }
    // one way is to use another array 


// second way is to transpose the matrix adn then reverse it => this helps us to change the same matrix
     public static void rotate(int[][] matrix) {

        transpose(matrix);
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length / 2; i++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - i - 1][j];
                matrix[matrix.length - i - 1][j] = temp;
            }
        }
             display(matrix);
    }

    public static void transpose(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void display(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
