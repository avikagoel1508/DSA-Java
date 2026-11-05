public class balanced_bt{
   
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

  public boolean isBalanced(TreeNode root) {
        return balanced(root).is_balanced;
    }
    public bp balanced(TreeNode root){
        if (root==null) {
            return new bp();
        }
       bp lbp=balanced(root.left);
       bp rbp=balanced(root.right);
       bp sbp=new bp();
       sbp.ht=Math.max(lbp.ht, rbp.ht)+1;
       sbp.is_balanced=lbp.is_balanced && rbp.is_balanced && Math.abs(lbp.ht - rbp.ht)<=1;
       return sbp;
    }
    class bp{
        int ht=-1;
        boolean is_balanced=true;
    }
}