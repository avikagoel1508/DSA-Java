public class substring_len_wise {
    public static void main(String[] args) {
        String s="abcd";
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <=s.length(); j++) {
                int i=j-len;
                System.out.println(s.substring(i,j));
            }
        }
    }
}
//O(n^2) : Time complexity