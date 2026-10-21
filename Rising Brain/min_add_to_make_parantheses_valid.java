import java.util.Stack;

public class min_add_to_make_parantheses_valid{
    public static void main(String[] args) {
        String s = "())";
        System.out.println(minmove(s));
    }
     public static int minmove(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && ch==')' && st.peek()=='('){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        return st.size();
    }
}