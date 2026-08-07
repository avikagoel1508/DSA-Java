import java.util.Scanner;

public class wave_print_rowise {
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
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j]+", ");
                }
            }
            else{
                for(int j=arr[0].length-1; j>=0; j--){
                    System.out.print(arr[i][j]+", ");
                }
            }
        
    }
    System.out.println("END");
    }
}
