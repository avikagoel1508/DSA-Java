import java.util.Scanner;

public class piyush_and_magical_park {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();

        char[][] arr = new char[m][n];

        // input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }
        escape(arr, k, s);
    }
    public static void escape(char[][] arr, int k, int s){
        int i=0;
        int j=0;
        while (i<arr.length && j<arr[0].length) {
            if (arr[i][j]=='.' && j<arr[0].length-1) {
                s=s-3;
                j++;
            }
           if (arr[i][j]=='.' && j==arr[0].length-1) {
                s=s-2;
                i++;
                j=0;
            }
            if (arr[i][j]=='*' && j<arr[0].length-1) {
                s=s+4;
                j++;
            }
            if (arr[i][j]=='*' && j==arr[0].length-1) {
                s=s+5;
                i++;
                j=0;
            }
            if (arr[i][j]=='#') {
                i++;
                j=0;
            }
            
        }
        if (s>k) {
            System.out.println("YES");
            System.out.println(s);
        }
        else{
            System.out.println("NO");
        }
    }
}
