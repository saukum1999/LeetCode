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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> res  = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if(root == null)
            return res;     
        que.offer(root);
        int len = que.size();
        
        while(!que.isEmpty()){
            TreeNode temp = que.poll();
            len--;
            if(temp.left != null) que.offer(temp.left);
            if(temp.right != null) que.offer(temp.right);
            if(len==0){
                res.add(temp.val);
                len = que.size();
            }
        }
        return res;
    }

}