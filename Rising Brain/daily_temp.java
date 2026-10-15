import java.util.Stack;

public class daily_temp{
    public static void main(String[] args) {
        int[] temp={73,74,75,71,69,72,76,73};
        int[] res=nextgreater(temp);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
     public static int[] nextgreater(int[] temp){
        int n=temp.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && temp[i]>temp[st.peek()]){
                ans[st.peek()]=i-st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=0;
        }
        return ans;
    }
}