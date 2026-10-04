import java.util.*;
public class subarray_with_sum_k {
    public static void main(String[] args) {
        int[] arr={10, 2, -2, -20, 10};
        int k=-10;
    System.out.println(countsubarray(arr, k));
    }
    public static int countsubarray(int[] arr, int k){

    HashMap<Integer, Integer> map = new HashMap<>();

    map.put(0, 1);

    int prefix = 0;
    int count = 0;

    for(int i = 0; i < arr.length; i++){

        prefix += arr[i];

        int val = prefix - k;

        if(map.containsKey(val)){
            count += map.get(val);
        }

        map.put(prefix, map.getOrDefault(prefix, 0) + 1);
    }

    return count;
}
}
