public class valid_palindrome {
    public static void main(String[] args) {
        String s= "A man, a plan, a canal: Panama";
              System.out.println(palindorme(s));
    }
    public static boolean palindorme(String s){
        s=s.toLowerCase();
        int i=0;
        int j=0;
        while (i<j) {
            char left=s.charAt(i);
            char right=s.charAt(j);
            if (!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(right)) {
                j++;
                continue;
            }
             if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        }
    }

