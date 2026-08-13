public class check_palindrome {
    public static void main(String[] args) {
        String s="nan";
        System.out.println(check(s));
    }

    public static boolean check(String s) {
       int i=0;
       int j=s.length()-1;
       while (i<j) {
        if (s.charAt(i)!=s.charAt(j)) {
            return false;
        }
        i++;
        j--;
       }
       return true;
    }
}
