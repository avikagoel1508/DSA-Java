public class remove_char {
    public static void main(String[] args) {
        String  str1 = "computer";
        String str2= "cat";
        int[] freq=new int[26];
        for (int i = 0; i < str1.length(); i++) {
            char ch=str1.charAt(i);
            freq[ch-'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch=str2.charAt(i);
            freq[ch-'a']--;
        }
for (int i = 0; i < str1.length(); i++) {
    char ch = str1.charAt(i);

    if (freq[ch - 'a'] != 0) {
        System.out.print(ch);
    }
}
    }
}
