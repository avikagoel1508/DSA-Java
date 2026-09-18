public class reverse_string {

    public static void main(String[] args) {
        char[]s={'h','e', 'l','l','o'};
 reverse(s);
        
    }
    public static void reverse(char[]s){
          int left = 0;
int right = s.length - 1;

while (left < right) {
    char temp = s[left];
    s[left] = s[right];
    s[right] = temp;

    left++;
    right--;
}
for (int i = 0; i < s.length; i++) {
    System.out.print(s[i]+" ");
}
    }
    
    }
