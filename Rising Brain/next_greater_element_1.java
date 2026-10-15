import java.util.*;
public class next_greater_element_1{
    public static void main(String[] args) {
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};
        int[] result=nextgreater(nums1, nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] nextgreater(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map=new HashMap<>();
        int[] ans=new int[nums1.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=1; i<nums2.length; i++){
            while(!st.isEmpty() && nums2[i]>nums2[st.peek()]){
                map.put(nums2[st.peek()], nums2[i]);
                st.pop();
            }
            
                st.push(i);
            
        }
         while(!st.isEmpty()){
                    map.put(nums2[st.pop()], -1);
                }
        for(int i=0; i<ans.length; i++){
            ans[i]=map.get(nums1[i]);

        }
        return ans;
    }
}