public class Person_client {
    public static void main(String[] args) {//throws Exception
        Person p=new Person("Avi", 18);
       System.out.println(p.getage());
       p.setage(-1);
       System.out.println(p.getage());

    }
}
