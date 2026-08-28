import java.util.Scanner;

public class rat_chases_its_cheeze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][] arr=new char[n][m];
        for (int i = 0; i < n; i++) {
            String s=sc.next();
            for (int j = 0; j <m; j++) {
                char ch=s.charAt(j);
                arr[i][j]=ch;
            }
        }
        int[][] ans=new int[n][m];
        path(arr, 0, 0, n-1, m-1, ans);
        if (val==true) {
            System.out.println("Path not found");
        }
    }
    static boolean val=true;
    public static void path(char[][] arr, int cr, int cc, int er, int ec, int[][]ans){
        if (cr<0 || cc<0 || cr>er || cc>ec || arr[cr][cc]=='X') {
            return;
        }
          if (cr==er && cc==ec) {
            ans[cr][cc]=1;
            val=false;
            display(ans);
            return;
        }
        arr[cr][cc]='X';
        ans[cr][cc]=1;
      path(arr, cr+1, cc,er,ec,ans); //down
      path(arr, cr, cc+1,er,ec,ans); //right
      path(arr, cr-1, cc,er,ec,ans); // up
      path(arr, cr, cc-1,er,ec,ans); //left
      arr[cr][cc]='O';
      ans[cr][cc]=0;
    }
    public static void display(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
