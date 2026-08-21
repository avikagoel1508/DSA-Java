public class maze_path {
    public static void main(String[] args) {
        int n=3;
        int m=3;
         path(n, m, 0, 0, "");
    }
    public static void path(int n, int m,int r, int c,  String ans){
        if (r>n || c>m) {
            return;
        }
        if (r==n-1 && c==m-1) {
            System.out.println(ans);
            return;
        }
         path(n, m, r+1, c, ans+'V');
         path(n, m, r, c+1, ans+'H');
    }
}
