import java.util.PriorityQueue;

public class min_sum_pair {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,4};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while (pq.size()>1) {
            int r1=pq.poll();
            int r2=pq.poll();
            ans=ans+r1+r2;
            pq.add(r1+r2);
        }
        System.out.println(ans);
    }
}
