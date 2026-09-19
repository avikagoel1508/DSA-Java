public class palindrome_number_bruteforce {
    public static void main(String[] args) {
        int n=-121;
       System.out.println(palindrome(n));
    }
    public static int reverse(int n){
        int ans=0;
        while (n!=0) {
       int rem=n%10;
        ans=ans*10+rem;
        n=n/10;
        }
        return ans;
    }
    public static boolean palindrome(int n){
        if (n==reverse(n)) {
            return true;
        }
        return false;
    }
}
