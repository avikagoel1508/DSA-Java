public class can_u_read_this {
    public static void main(String[] args) {
        String s="IAmACompetitiveProgrammer";
           words(s);

    }
    public static void words(String s){
        int si=0;
        int ei=0;
        while (ei<s.length()) {
              if (s.charAt(si)>='A' && s.charAt(si)<='Z') {
                ei=si+1;
                while (ei<s.length()&&s.charAt(ei)>='a' && s.charAt(ei)<='z' && si<=ei) {
                    ei++;
                }
               
                System.out.println(s.substring(si, ei));
               
                si=ei;
            }
        }
          
        }
    }

