public class vowel_consonant{
    public static void main(String[] args) {
        String s="Alice";
        System.out.print("No of vowels are:");
        System.out.println(vowel(s));
        int v=vowel(s);
        System.out.print("no of consonants are:");
        System.out.println(s.length()-v);
    }
    public static int vowel(String s){
        int c=0;
           for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'||
             s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||
             s.charAt(i)=='O'||s.charAt(i)=='U') {
                c++;
            }
           }
           return c;
    }
}