public class queue_reverse {
    public static void main(String[] args)throws Exception {
        Queue q=new Queue();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.display();
        reverse(q);
        q.display();
    }
    public static void reverse(Queue q)throws Exception{
        if (q.isEmpty()) {
            return;
        }
        int x=q.Dequeue();
        reverse(q);
        q.Enqueue(x);

    }
}
