import java.util.Stack;

public class backspace_string_compare {
    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
         String s1=backspace(s);
        String s2=backspace(t);
        boolean ans= s1.equals(s2);
        System.out.println(ans);
    }
    public static String backspace(String str){
        String ans="";
        Stack<Character> st=new Stack<>();
       for(int i=0; i<str.length(); i++){
        if(str.charAt(i)!='#'){
            st.push(str.charAt(i));
        }
        else{
            if(!st.isEmpty()){
                st.pop();
            }
        }
       }
         while(!st.isEmpty()){
            ans+=st.pop();
         }
         return ans;
    }
}
