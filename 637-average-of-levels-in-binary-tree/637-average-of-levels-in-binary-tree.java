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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> res = new ArrayList<>();
        if(root == null)
            return res;
        
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int count = que.size();
        double div = count;
        double sum = 0;
        
        while(!que.isEmpty()){
        
            TreeNode node = que.poll();
            sum += node.val;
            count--;
            
            if(node.left != null)
                que.offer(node.left);
            if(node.right != null)
                que.offer(node.right);
            
            if(count <= 0){            
                res.add(sum / div);
                count = que.size();
                div = count;
                sum = 0;
            }
            
        }
        
        return res;
        
        
    }
}