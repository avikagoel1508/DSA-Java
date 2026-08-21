public class generate_parantheses {
    public static void main(String[] args) {
        int n=3;
      print(n, 0, 0, "");
    }
    public static void print(int n, int open, int close, String ans){
             if (open==n && close==n) {
                System.out.println(ans);
                return;
             }
             if (close>open || open>n || close>n) {
                return;
             }
             print(n, open+1, close, ans+'(');
             print(n, open, close+1, ans+')');
    }
}
