/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode head = new ListNode();
        ListNode res = head;
        if(lists.length == 0)
            return null;
        
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(lists.length , new Comparator<ListNode>(){

        @Override
        public int compare(ListNode l1, ListNode l2){
            if(l1.val <l2.val)
                return -1;
            else if (l1.val == l2.val)
                return 0;
            else 
                return 1;
        }
    });

        for(ListNode n : lists){

            while(n != null){
                minHeap.add(n);
                n = n.next;
            }
        }


        while(!minHeap.isEmpty()){
            res.next = minHeap.poll();
            res = res.next;
            res.next = null;
        }

        return head.next;

    }
}