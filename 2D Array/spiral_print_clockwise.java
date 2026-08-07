import java.util.Scanner;

public class spiral_print_clockwise {
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
        print(arr);
    }

    public static void print(int[][] arr) {
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int te=arr.length*arr[0].length;
        int c=0;
        while (c<te) {
            //first row
            for (int i = minc; i <=maxc && c<te; i++) {
                System.out.print(arr[minr][i]+", ");
                c++;
            }
            minr++;
 // last col
            for (int i = minr; i <=maxr && c<te; i++) {
                System.out.print(arr[i][maxc]+", ");
                c++;
            }
            maxc--;
// last row
            for (int i = maxc; i >=minc && c<te; i--) {
                System.out.print(arr[maxr][i]+", ");
                c++;
            }
            maxr--;

            for (int i = maxr; i>=minr && c<te; i--) {
                System.out.print(arr[i][minc]+", ");
                c++;
            }
            minc++;
        }
        System.out.println("END");
    }
}
