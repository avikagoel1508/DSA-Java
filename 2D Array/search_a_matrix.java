import java.util.Scanner;

public class search_a_matrix {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
         int[][] arr=new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        System.out.println(search(arr, x));
    }

    public static int search(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        while (i<matrix.length && j>=0) {
            if (matrix[i][j]>target) {
                j--;
            }
            else if (matrix[i][j]<target) {
                i++;
            }
            else{
                return 1;
            }
        }
        return 0;
    }
}
