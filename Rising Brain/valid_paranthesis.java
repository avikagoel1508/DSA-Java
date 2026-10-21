import java.util.Stack;

public class valid_paranthesis {
    public static void main(String[] args) {
        String s = "([)]";
      System.out.println(valid(s));
    }
    public static boolean valid(String s){
       Stack<Character> st=new Stack<>();
       for (int i = 0; i < s.length(); i++) {
        char ch=s.charAt(i);
        if (ch=='(' || ch=='[' || ch=='{') {
            st.push(ch);
        }
        else{
            if (st.isEmpty()) {
                return false;
            }
            if ((ch=='(' && st.peek()==')') || (ch=='[' && st.peek()==']')|| (ch=='{' && st.peek()=='}')) {
                st.pop();
            }
            else{
                return false;
            }
        }
       }
         return st.size()==0;
    }

}
