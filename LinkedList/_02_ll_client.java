public class _02_ll_client {
    public static void main(String[] args) {
        _01_Implementation ll=new _01_Implementation();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.display();
        ll.addlast(40);
        ll.addfirst(50);
        ll.display();
        ll.addatindex(60, 3);
        ll.display();
    }
}
