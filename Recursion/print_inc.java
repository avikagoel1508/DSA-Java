public class print_inc{
    public static void main(String[] args) {
        int n=5;
        print(n);
    }
    public static void print(int n){
       if (n==1) {
        System.out.println(n);
        return;
       }
       print(n-1);
       System.out.println(n);
    }
}