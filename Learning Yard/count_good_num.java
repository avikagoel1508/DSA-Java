public class count_good_num {
    static final long MOD = 1000000007;
        public static void main(String[] args) {
            int n=50;
        long e = (n + 1) / 2;
        long o = n / 2;

        long a1 = pow(5, e);
        long a2 = pow(4, o);

        int ans= (int)((a1 * a2) % MOD);
        System.out.println(ans);
    }
     public static long pow(long base, long exp) {

        // Base case
        if (exp == 0) {
            return 1;
        }

        // Calculate half power
        long half = pow(base, exp / 2);

        // If exponent is even
        if (exp % 2 == 0) {
            return (half * half) % MOD;
        }

        // If exponent is odd
        return (half * half % MOD * base) % MOD;
    }
}
