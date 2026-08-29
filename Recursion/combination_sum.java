import java.util.ArrayList;
import java.util.List;

public class combination_sum {
   public static void main(String[] args) {
   int[] coin={2,3,5};
   int amount=8;
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Combination(coin, amount, ll, ans, 0);
        System.out.println(ans);
    }

    public static void Combination(int[] coin, int amount,List<Integer> ll,List<List<Integer>> ans, int idx) {
		if (amount == 0) {
			// System.out.println(ans);
           ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
                ll.add(coin[i]);
				Combination(coin, amount - coin[i],ll,ans, i);
                ll.remove(ll.size()-1);
			}
		}

	}

}
