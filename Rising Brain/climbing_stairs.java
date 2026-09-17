public class climbing_stairs{
    
    public static void main(String[] args) {
        int n=3;
        System.out.println(steps(n, 0));
    }

    public static int steps(int n, int ans){
       
        if (ans==n) {
          
            return 1;
        }
        if (ans>n) {
            return 0;
        }
       int a1=steps(n, ans+1);
       int a2=steps(n, ans+2);
       return a1+a2;
    }
}