public class _01_Implementation{
   
     class Node{
    int data;
    Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    public void addfirst(int item){
        Node nn=new Node();
        nn.data=item;
        if (size==0) {
            head=nn;
            tail=nn;
            size++;
        }
        else{
            nn.next=head;
            head=nn;
            size++;
        }
    }
    public void display(){
        if (head==null) {
            System.out.println("Linked list does not exist");
        }
        else{
            Node temp=new Node();
            temp=head;
            while (temp!=null) {
                System.out.print(head.data+" -> ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

}