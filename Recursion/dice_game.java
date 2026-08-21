public class dice_game {
    public static void main(String[] args) {
        int n=4;
        int dice=3;
     comb(n, dice, "", 0);
    }
    public static void comb(int n, int dice, String ans, int sum){
        if (sum==n) {
            System.out.println(ans);
            return;
        }
        if (sum>n) {
            return;
        }
       for (int i = 1; i <=dice ; i++) {
        comb(n, dice, ans+i, sum+i);
       }
    }
}
