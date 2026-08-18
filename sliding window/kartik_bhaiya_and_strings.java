public class kartik_bhaiya_and_strings {
    public static void main(String[] args) {
        String s="aaababaaabbab";
        int k=2;
      int flipa=perfectstr(s, k, 'a');
      int flipb=perfectstr(s, k, 'b');
      System.out.println(Math.max(flipa, flipb));
    }
    public static int perfectstr(String s, int k, char ch){
        int si=0;
        int ei=0;
        int ans=0;
        int flip=0;
        while (ei<s.length()) {
            // grow
           if(s.charAt(ei)==ch) {
				flip++;
			}
            //shrink
            while (flip>k && si<=ei) {
                if (s.charAt(si)==ch) {
                    flip--;
                }
                si++;
            }
            //ans
            ans=Math.max(ans, ei-si+1);
            ei++;
        }
 return ans;
    }
}
