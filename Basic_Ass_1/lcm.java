public class lcm {
    public static void main(String[] args) {
        int n1=4;
        int n2=6;
        int ans=0;
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            if (i%n1 ==0 && i%n2==0) {
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
