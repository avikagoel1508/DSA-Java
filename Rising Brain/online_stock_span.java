import java.util.ArrayList;
import java.util.Stack;

public class online_stock_span {
    class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        return calspan(arr);
    }
  public static ArrayList<Integer> calspan(int[] arr) {
      ArrayList<Integer> ans = new ArrayList<>();
      Stack<Integer> st = new Stack<>();

      for (int i = 0; i < arr.length; i++) {

          while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
              st.pop();
          }

          if (st.isEmpty()) {
              ans.add(i + 1);
          } else {
              ans.add(i - st.peek());
          }

          st.push(i);
      }

      return ans;
  }
}
}
