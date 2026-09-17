public class Person {
    private String name="Kaju";
    private int age=17;
     public Person(String name, int age){
         this.name=name;
         this.age=age;
     }
    public String getname(){
      return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
      return age;
    }
    public void setage(int age){//throws Exception
        try {
            if (age<0) {
                // return;
                throw new Exception("Age can't be negative");
                
            }
            this.age=age;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }


}
