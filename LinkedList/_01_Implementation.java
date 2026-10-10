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
    public void addlast(int item){
        if (size==0) {
            addfirst(item);
        }
        else{
            Node nn=new Node();
            nn.data=item;
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    public Node getnode(int k){
      Node temp=head;
      for (int i = 0; i < k; i++) {
        temp=temp.next;
      }
      return temp;
    }

    public void addatindex(int item, int k){
        if (k==0) {
            addfirst(item);
        }
        else{
            Node nn=new Node();
            nn.data=item;
            Node temp=head;
            for (int i = 0; i < k-1; i++) {
                temp=temp.next;
            }
            nn.next=temp.next;
            temp.next=nn;
            size++;
        }
    }
    	
	

	
	// O(1)
	public int removefirst() {
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			temp.next = null;
		}
		size--;
		return temp.data;

	}
    private Node getNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}
	// O(N)
	public int removelast() {
		if (size == 1) {
			return removefirst();
		} else {
			Node prev = getNode(size - 2);
			int temp = tail.data;
			prev.next = null;
			tail = prev;
			size--;
			return temp;
		}

	}
	// O(N)
	public int removeatindex(int k) {
		if(k==0) {
			return removefirst();
		}
		else if(k==size-1) {
			return removelast();
		}
		else {
			Node prev=getNode(k-1);
			Node curr=prev.next;
			prev.next=curr.next;
			curr.next=null;
			size--;
			return curr.data;
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
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

}