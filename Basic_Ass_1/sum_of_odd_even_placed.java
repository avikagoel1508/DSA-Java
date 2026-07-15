public class sum_of_odd_even_placed{
    public static void main(String[] args) {
        int n =2635;
        int so=0;
        int se=0;
       int count=count(n);
       for(int i =1; i<=count; i++){
        if (i%2!=0) {
            int rem=n%10;
            so+=rem;
            n=n/10;
        }
        else{
           int rem=n%10;
            se+=rem;
            n=n/10; 
        }
       }
       System.out.println(so);
       System.out.println(se);
    }
    public static int count(int n){
        int c=0;
      while (n>0) {
        int rem=n%10;
     c++;
     n=n/10;
      }
      return c;
    }
}