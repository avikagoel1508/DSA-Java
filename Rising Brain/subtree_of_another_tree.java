import javax.swing.tree.TreeNode;

public class subtree_of_another_tree {
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
 

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       return find(root, subRoot);
        
    }
    public boolean find(TreeNode root, TreeNode subroot){
        if(root==null){
            return false;
        }
        boolean left=find(root.left, subroot);
        boolean right=find(root.right, subroot);
            if(root.val==subroot.val){
                if(same(root, subroot)){
                    return true;
                }
            }
            return left || right;
    }
    public boolean same(TreeNode root, TreeNode subroot){
           if(root==null && subroot==null){
            return true;
           }
           if(root==null || subroot==null){
            return false;
           }
           if(root.val!=subroot.val){
            return false;
           }
           boolean left=same(root.left, subroot.left);
           boolean right=same(root.right, subroot.right);

           return left && right;
    }
}

