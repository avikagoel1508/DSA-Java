import java.util.Stack;
public class stack_reverse {
    public static void main(String[] args) {
         Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);

    }
    public static void reverse( Stack<Integer> st){
       if (st.isEmpty()) {
        return;
       }
       int x=st.pop();
       reverse(st);
       insert(x, st);
    }
     public static void insert(int item, Stack<Integer> st){
        if (st.isEmpty()) {
            st.push(item);
            return;
        }
       int x=st.pop();
       insert(item, st);
       st.push(x);
       
    }
}
