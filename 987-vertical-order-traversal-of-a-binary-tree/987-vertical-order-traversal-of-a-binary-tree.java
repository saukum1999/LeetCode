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
class Tuple{
    TreeNode node;
    int row;
    int col;

    public Tuple(TreeNode _node, int _row, int _col){
        node = _node;
        row = _row;
        col = _col;
    }
}

class Solution{
    public List<List<Integer>> verticalTraversal(TreeNode root){
        TreeMap <Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root, 0, 0));
        while(!q.isEmpty()){
            Tuple tuple = q.poll();
            TreeNode node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;

            if(!map.containsKey(x)){
                map.put(x, new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y, new PriorityQueue<>());
            }
            map.get(x).get(y).offer(node.val);

            if(node.left != null){
                q.offer(new Tuple(node.left, x - 1, y + 1));
            }
            if(node.right != null){
                q.offer(new Tuple(node.right, x + 1, y + 1));
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()){
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes : ys.values()){
                while(!nodes.isEmpty()){
                    // System.out.println(nodes.peek());
                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }
        return list;
    }
}

// class Solution {
//     public List<List<Integer>> verticalTraversal(TreeNode root) {
        
//         List<List<Integer>> res = new ArrayList<>();
//         HashMap<Integer, List<Integer>> map = new HashMap<>();
//         List<Integer> lst = new ArrayList<>();
//         Queue<TreeNode> que = new LinkedList<>();
//         Queue<Integer> queCol = new LinkedList<>();
//         // int col = new int;
//         que.offer(root);
//         queCol.offer(0);
//         // lst.add(root.val);
//         // map.put(0, lst);
        
//         while(!que.isEmpty()){
//             int col = queCol.poll();
//             TreeNode temp = que.poll();
//             if(map.containsKey(col))
//                 lst = map.get(col);
//             else
//                 lst = new ArrayList<>();
//             lst.add(temp.val);
//             map.put(col, lst);
                        
//             if(temp.left != null){
//                 queCol.offer(col - 1);
//                 que.offer(temp.left);
//             }
//             if(temp.right != null){
//                 queCol.offer(col + 1);
//                 que.offer(temp.right);
//             }
//         }
        
//         List<Integer> tset = new ArrayList<>(map.keySet());
//         Collections.sort(tset);
//         for(Integer key : tset){
//             List<Integer> temp = new ArrayList<>(map.get(key));
//             Collections.sort(temp);
//             res.add(temp);
//         }
        
//         return res;
//     }
// }