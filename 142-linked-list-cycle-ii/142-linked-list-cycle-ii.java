/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                flag=true;
                break;
            }
        }
        
        if(fast==null || fast.next ==null)
            return null;
        while(true){
            if(head==slow)
                break;
            head = head.next;
            slow = slow.next;
            
        }
        
        return head;
    }
}