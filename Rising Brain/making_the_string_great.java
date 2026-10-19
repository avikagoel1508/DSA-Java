import java.util.Stack;

public class making_the_string_great {
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(good(s));
    }
     public static String good(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() &&  Math.abs(ch - st.peek()) == 32){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
          StringBuilder ans = new StringBuilder();

        for (char c : st) {
            ans.append(c);
        }

        return ans.toString();
    }
    
}
