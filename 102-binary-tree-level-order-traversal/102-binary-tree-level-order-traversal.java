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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();

        if(root==null)
            return result;
        
        que.add(root);

        while (!que.isEmpty()) {
            int size = que.size();
            List<Integer> l1 = new ArrayList<>();
            while (size > 0) {
                TreeNode curr = que.remove();
                l1.add(curr.val);
                if (curr.left != null)
                    que.add(curr.left);
                if (curr.right != null)
                    que.add(curr.right);
                size--;
            }
            result.add(l1);
        }

        return result;

    }
}