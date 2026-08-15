public class count_freq {
    public static void main(String[] args) {
        String s = "GeeksforGeeks";
        count(s);
    }

    public static void count(String s) {
        int[] low = new int[27];
        int[] upr = new int[27];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                low[ch - 'a']++;
            } else if (ch >= 'A' && ch <= 'Z') {
                upr[ch - 'A']++;
            } else {
                continue;
            }
        }
        for (int i = 0; i < low.length; i++) {

            if (low[i] > 0) {
                char ch = (char) ('a' + i);
                System.out.println(ch + " : " + low[i]);
            }
        }
        for (int i = 0; i < upr.length; i++) {

            if (upr[i] > 0) {
                char ch = (char) ('A' + i);
                System.out.println(ch + " : " + upr[i]);
            }
        }
    }
}
