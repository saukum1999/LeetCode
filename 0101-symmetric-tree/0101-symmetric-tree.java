/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if((root.left == null && root.right != null) || (root.left != null & root.right == null))
            return false;
        return check(root.left, root.right);
    }
    
    public boolean check (TreeNode r1, TreeNode r2){
        if(r1 == null && r2 == null)
            return true;
        else if((r1 == null && r2 != null) || (r1 != null & r2 == null))
            return false;
        else if(r1.val != r2.val)
            return false;
        // else if(r1.val == r2.val)
        //     return check(r1.left, r2.right) && check(r1.right, r2.left);
        return check(r1.left, r2.right) && check(r1.right, r2.left);
    }
}