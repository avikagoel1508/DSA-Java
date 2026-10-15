public class valid_palindrome_2 {
    public static void main(String[] args) {
        String s="abca";
     System.out.println(validPalindrome(s));
    }
     public static  boolean validPalindrome(String s) {
         int i=0;
        int j=s.length()-1;
         while(i<=j){
           if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;
           }
           else{
              return ispalindrome(s, i, j-1)|| ispalindrome(s, i+1, j);
           }
           }
      return true;
    }
     public static boolean ispalindrome(String s, int i, int j){
           while(i<=j){
           if(s.charAt(i)!=s.charAt(j)){
           return false;
           }
           i++;
           j--;
           }
           return true;
    }
}
