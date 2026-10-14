public class min_speed_to_arrive_ontime{
    public static void main(String[] args) {
        int[] suat={1,3,2};
        double hours=2.7;
    }
     public static int minspeed(int[] dist, double hr) {
        int lo = 1;
        int hi = 10000000;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isvalid(dist, hr, mid) == true) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isvalid(int[] dist, double hr, int mid) {
        double reqhrs = 0;
        for (int i = 0; i < dist.length - 1; i++) {
            reqhrs += (dist[i] + mid - 1) / mid;
        }
        reqhrs += (double) dist[dist.length - 1] / mid;
        if (reqhrs <= hr) {
            return true;
        }
        return false;
    }
}