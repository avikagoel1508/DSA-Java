public class power {
    public static void main(String[] args) {
        int a=3;
        int b=3;
        System.out.println(pow(a,b));
    }
    public static int pow(int a, int b){
     if (b==1) {
        return a;
     }
   return  pow(a, b-1)*a;
    }
}
