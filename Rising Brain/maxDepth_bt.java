public class maxDepth_bt {    
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
 
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lht=maxDepth(root.left);
        int rht=maxDepth(root.right);
        int sht=Math.max(lht, rht)+1;
        return sht;
    
}
}
