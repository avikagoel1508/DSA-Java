import java.util.Stack;

public class min_stringlen_after_removing_substring {
    public static void main(String[] args) {
        String s = "ABFCACDB";
        System.out.println(minimumlength(s));
    }
    public static int minimumlength(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && ((ch=='B' && st.peek()=='A') || (ch=='D' && st.peek()=='C'))){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
         return st.size();
    }
}
