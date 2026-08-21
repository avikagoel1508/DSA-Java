public class lexicographic_counting {
    public static void main(String[] args) {
        int n=100;
     lexico(n, 0);
    }
    public static void lexico(int n , int curr){
        if (curr>n) {
            return;
        }
        System.out.println(curr);
        int i=0;
        if (curr==0) {
             i=1;
        }
        for (; i <=9; i++) {
            lexico(n, curr*10+i);
        }
    }
}
