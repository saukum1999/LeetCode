/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        // List<Integer> ans = new ArrayList<>();
        
        // int size = 0;
        q.offer(root);
        // size = q.size();
        
        while(!q.isEmpty()){
            // Node temp = q.poll();
            int size = q.size();
            List<Integer> ans = new ArrayList<>();
            for(int i = 0; i < size; i++){
                ans.add(q.peek().val);
                for(Node temp : q.peek().children)
                    q.offer(temp);
                q.poll();
            }
            // q.poll();
            res.add(new ArrayList<>(ans));
            
           
        }
        
        return res;
        
        
    }
}