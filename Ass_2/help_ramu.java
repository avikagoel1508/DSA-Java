public class help_ramu {
    public static void main(String[] args) {
        int [] cost={1,3,7,19};
        int n=2;
        int m=3;
        int [] rick={2,5};
        int[] cab={4,4,4};
        System.out.println(minimum(cost, n, m, rick, cab));

    }
    public static int minimum(int[] cost, int n, int m, int[] rick, int[] cab){
        int rs=0;
        for (int i = 0; i < rick.length; i++) {
            rs+=Math.min(rick[i]*cost[0], cost[1]);
        }
        int rt=Math.min(cost[3], rs);

        int cs=0;
        for (int i = 0; i < cab.length; i++) {
             cs+=Math.min(cab[i]*cost[0], cost[1]);
        }
        int ct=Math.min(cost[2], cs);
        int total=Math.min(ct+rt, cost[3]);
        return total;
    }
}
