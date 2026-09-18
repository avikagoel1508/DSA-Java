public class Queue {
    private int[]arr;
    private int front=0;
    private int idx=0;

public Queue(){
    arr=new int[5];
}
public Queue(int n){
  arr=new int[n];
}
 
public boolean isEmpty(){
    return front==idx;
}

public void Enqueue(int item)throws Exception{
  if (idx-front==arr.length) {
    throw new Exception("Queue Overflow");
  }
    // arr[idx]=item; linear queue
    arr[idx%arr.length]=item; // circular queue
      idx++;
}
 
public int Dequeue() throws Exception{
    if (isEmpty()) {
        throw new Exception("Queue Underflow");
    }
    int rv=arr[front];
    // front++;  linear queue
    front=(front+1)%arr.length;  // circular queue 
    return rv;

}
public int size(){
  return idx-front;
}

public void display(){
    for (int i = 0; i <idx-front; i++) {
        int id=(front+i)%arr.length;
        System.out.print(arr[id]+" ");
    }
    System.out.println();
}
}
