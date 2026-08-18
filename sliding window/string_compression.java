public class string_compression {
    public static void main(String[] args) {
        String s="aaabbccds";
         System.out.print(compression(s));
    }
    public static String compression(String s){
        int si=0;
        int ei=0;
        int len=0;
        String ans="";
      while (ei<s.length()) {
          while (ei<s.length() && s.charAt(si)==s.charAt(ei)) {
              ei++;
          }
          len=ei-si;
          ans=ans+s.charAt(si)+len;
          si=ei;
      }
        return ans;
    }
}
