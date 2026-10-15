import java.util.Stack;

public class next_greater_element_2 {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        int[] res=nextgreater(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
     public static int[] nextgreater(int[] nums){
        int n=nums.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        
        for(int i=0; i<2*n; i++){
            int num=nums[i%n];
            while(!st.isEmpty() && num>nums[st.peek()]){
               ans[st.pop()]=num;              
            }
             if(i<n){
             st.push(i);
                }
            
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        return ans;
    }
}
