import java.util.Stack;
public class next_greater_element{
    public static void main(String[] args) {
        int[] arr={5,11,9,7,13,3};
          int[] a=next_greater(arr);
          for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
          }
    }
    public static int[] next_greater(int[] arr){
      Stack<Integer> st=new Stack<>();
      int[] ans=new int[arr.length];
      st.push(0);
      for (int i = 1; i < arr.length; i++) {
        while (!st.isEmpty() && arr[i]>arr[st.peek()] ) {
            ans[st.peek()]=arr[i];
            st.pop();
        }
        st.push(i);
      }
      while (!st.isEmpty()) {
        ans[st.peek()]=-1;
        st.pop();
      }
      return ans;
    }
}