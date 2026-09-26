import java.util. Stack;
public class stock_span {
    public static void main(String[] args) {
        int[] arr={30, 35, 40, 38, 35};
           int[] ans=span(arr);
           for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+"  ");
           }
    }
    public static int[] span(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()]<arr[i]) {
                st.pop();
            }
             if (st.isEmpty()) {
            ans[i] = i + 1;
        } else {
            ans[i] = i - st.peek();
        }

        st.push(i); 
        }
           return ans;
    }
}
