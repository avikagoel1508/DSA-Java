public class palindrome_number_optimize {
    public static void main(String[] args) {
        int n=-6;
        int x=Math.abs(n);
        String s=String.valueOf(x);
        
       System.out.println(palindrome(s));
    }
    public static boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;
        while (i<=j) {
            if (s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
