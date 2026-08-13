public class good_string {
    public static void main(String[] args) {
        String s="cbaeicdeaiouoeasytg";
        System.out.println(longest_string(s));

    }
    public static int longest_string(String s){
        int ans=0;
        int len=0;
        for (int i = 0; i < s.length(); i++) {
            if (isvowel(s,i)==false) {
                len=0;
            }
            else{
               len++;
            ans=Math.max(ans, len);
            }
           
            
        }
        return ans;
    }
    public static boolean isvowel(String s,int i) {
         if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
            return true;
         }
        return false;
    }
}

