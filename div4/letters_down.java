
import java.util.Scanner;

public class letters_down {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder(sc.next());

            int i = 0, j = n - 1;
            int ans = 0;

            while (i < j) {
                char ch1 = sb.charAt(i);
                char ch2 = sb.charAt(j);

                if (ch1 == ch2) {
                    i++;
                    j--;
                } else {
                    char larger = (char)Math.max(ch1, ch2);

                    for (int k = 0; k < n; k++) {
                        if (sb.charAt(k) == larger) {
                            sb.setCharAt(k, (char)(larger - 1));
                        }
                    }

                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}
