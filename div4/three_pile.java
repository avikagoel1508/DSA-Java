import java.util.Scanner;

public class three_pile{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            if (b-a ==1 && c-b==1) {
                System.out.println("yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}