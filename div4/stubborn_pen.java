import java.util.Scanner;

public class stubborn_pen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            String s=sc.next();
            int c=0;
            if (s.charAt(0)!='R') {
                c++;
            }
            for (int i = 1; i < s.length(); i++) {
                char ch=s.charAt(i);
               if (ch==s.charAt(i-1)) {
                c++;
               }
            }
            System.out.println(c);
        }
    }
}
