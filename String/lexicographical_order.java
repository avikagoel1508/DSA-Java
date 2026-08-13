public class lexicographical_order {
    public static void main(String[] args) {
        String s1="komal";
        String s2="kunal";
         System.out.println(ans(s1, s2));
         //+ve => s1>s2
         //-ve s2>s1
         //0 s1==s2
    }
    public static int ans(String s1, String s2){
          if (s1==s2) {
            return 0;
          }
         int len=Math.min(s1.length(), s2.length());
         for (int i = 0; i < len; i++) {
            if (s1.charAt(i)!=s2.charAt(i)) {
                return s1.charAt(i)-s2.charAt(i);
            }
         }
         return s1.length()-s2.length();
    }
}
