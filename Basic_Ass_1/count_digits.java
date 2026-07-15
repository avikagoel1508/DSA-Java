public class count_digits {
    public static void main(String[] args) {
        int n=5433231 ;
        int digit=3;
    System.out.println(occ(n, digit));
    }
    public static int occ(int n , int digit){
        int c=0;
        while (n>0) {
            int rem=n%10;
            if (rem==digit) {
                c++;
            }
            n=n/10;
        }
        return c;
    }
}
