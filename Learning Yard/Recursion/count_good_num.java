package Recursion;

public class count_good_num {
    public static void main(String[] args) {
        String s="2345";
        int num=Integer.parseInt(s);

    }
    public static int good(int num, String s){
        int n=s.length();
        int[] arr=new int[n];
        for (int i = 1; i<=n ; i++) {
            arr[n-i]=num%10;
            num=num/10;
        }
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if (isgood(i, arr)==true) {
                c++;
            }
        }
        return c;
    }
    public static boolean isgood(int idx, int[]arr){
        if (idx%2==0 && arr[idx]%2==0 ) {
            return true;
        }
        else if (idx%2!=0 && arr[idx]==isprime(n)) {
            return true;
        }
        return false;
    }
    public static boolean isprime(int n){
        if (n==2 ||n==3 ||n==5 ||n==7 ) {
            return true;
        }
        return false;
    }
}
