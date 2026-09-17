public class Stack{
   private int[] arr;
   int idx=-1;
   public Stack(){
      arr=new int[5];
   }
   public Stack(int n){
        arr=new int[n];
   }
    public void push(int item) throws Exception{
     arr[++idx]=item;
     if (idx==arr.length-1) {
        throw new Exception("Stacks overflow");
     }
    }
    public int peek(){
        return arr[idx];
    }
    public int pop() throws Exception{
        if (isEmpty()) {
            throw new Exception("Stacks underflow");
        }
       int rv=arr[idx];
       idx--;
       return rv;
    }
    public boolean isEmpty(){
      if (idx==-1) {
        return true;
      }
      return false;
    }
    public int size(){
       return idx+1;
    }
    public void display(){
     for (int i = 0; i <=idx; i++) {
        System.out.print(arr[i]+"  ");
     }
     System.out.println();
    }
    public boolean isFull(){
     return idx==arr.length-1;
    }
}