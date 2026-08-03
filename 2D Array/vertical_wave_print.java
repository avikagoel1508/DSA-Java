import java.util.Scanner;

public class vertical_wave_print{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        print(arr);
    }

    public static void print(int[][] arr) {
     for (int i = 0; i < arr[0].length; i++) {
        if (i%2==0) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i]+"  ");
            }
        }
        else{
            for (int j = arr.length-1; j>=0; j--) {
                System.out.print(arr[j][i]+"  ");
            }
        }
     }  
    }
}