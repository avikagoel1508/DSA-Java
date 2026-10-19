import java.util.Stack;

public class remove_all_adjacent_duplicate {
    public static void main(String[] args) {
        String s = "abbaca";
        String ans=duplicates(s);
        System.out.println(reverse(ans));
    }
     public static String duplicates(String s){
        Stack<Character> st=new Stack<>();
       StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
           if(!st.isEmpty() && ch==st.peek()){
            st.pop();
           }
           else{
            st.push(ch);
           }
        }
        while(!st.isEmpty()){
           ans.append(st.pop());
        }
        return ans.toString();
    }

    public static String reverse(String s) {
    String a = "";

    for (int i = s.length() - 1; i >= 0; i--) {
        a += s.charAt(i);
    }

    return a;
}
}
