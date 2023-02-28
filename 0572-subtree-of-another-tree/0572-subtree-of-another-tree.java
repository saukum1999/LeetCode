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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        boolean a = false;
        if(root != null){
            if(root.val == subRoot.val)
                a = match(root, subRoot);
            return (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot) || a);
        }
        return false;
    }
    public boolean match (TreeNode root1, TreeNode root2){
        if ((root1 == null && root2 != null) || (root1 != null && root2 == null))
            return false;
        if(root1 == null && root2 == null)
            return true;
        if(root1.val != root2.val)
            return false;
        
        return (match(root1.left, root2.left) && match(root1.right, root2.right));
        
    }
}
