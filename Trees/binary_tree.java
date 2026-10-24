import java.util.Scanner;

public class binary_tree{
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc=new Scanner(System.in);
    public binary_tree(){
        root=createTree();
    }
    // lce=> left child exists  ||  rce=> right child exists
    private Node createTree() {
        int item=sc.nextInt();
       Node nn=new Node();
      nn.val=item;
      boolean lce=sc.nextBoolean();
      if (lce) {
        nn.left=createTree();
      }
      boolean rce=sc.nextBoolean();
      if (rce) {
        nn.right=createTree();
      }

       return nn;
    }
    public void display(){
        display(root);
    }
    private void display(Node nn){
        if (nn==null) {
            return ;
        }
       String s="";
       System.out.println();
       s="<--" + nn.val +"-->";
       if (nn.left!=null) {
        s=nn.left.val+s;
       }
       else{
        s="."+s;
       }
       if (nn.right!=null) {
        s=s+nn.right.val;
       }
       else{
        s=s+".";
       }
       System.out.println(s);
       display(nn.left);
       display(nn.right);
    }
    public int max(){
        return max(root);
    }
    private int max(Node node){
        if (node==null) {
            return Integer.MIN_VALUE;
        }
        int lmax=max(node.left);
        int rmax=max(node.right);
        return Math.max(node.val, Math.max(lmax, rmax));
    }
    public boolean find(int item){
       return find(root, item);
    }
    private boolean find(Node node, int item){
        if (node==null) {
            return false;
        }
        if (node.val==item) {
            return true;
        }
        boolean left=find(node.left, item);
        boolean right=find(node.right, item);
        return left||right;
    }
}