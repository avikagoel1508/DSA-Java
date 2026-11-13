import java.util.Collections;
import java.util.PriorityQueue;

public class kth_largest_element {
    public static void main(String[] args) {
        int[] arr={3,2,1,5,6,4};
        int k=2;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        pq.poll();
        System.out.println(pq.peek());

    }
    // ................................Optimized.....................................................
    public int optimized(int[] nums, int k) {
         PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        
        return pq.peek();
    }
    
}
