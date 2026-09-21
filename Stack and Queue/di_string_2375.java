import java.util.Stack;
public class di_string_2375 {
    public static void main(String[] args) {
        String pattern="IIIDIDDD";
        System.out.println(construct(pattern));
    }
    public static String construct(String pattern){
        int c=1;
        int[] ans=new int[pattern.length()+1];
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i <= pattern.length(); i++) {
            if (i==pattern.length() || pattern.charAt(i)=='I') {
                ans[i]=c;
                c++;
                while (!st.isEmpty()) {
                    ans[st.pop()]=c;
                    c++;
                }
            }
            else{
                st.push(i);
            }
        }
        String a="";
        for (int i = 0; i < ans.length; i++) {
            a+=ans[i];
        }
        return a;
    }
}
