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
    public void reorderList(ListNode head) {

        if(head.next == null)
            return;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

            // if(fast == null)
            // prev = slow;
        }

        prev.next = null;
        
        slow = reverseList(slow);
        Merge(head, slow);
        // head.next = slow;

    }

    public ListNode reverseList(ListNode l1) {

        ListNode temp = null;
        ListNode cur = l1;

        while (cur != null) {
            l1 = cur.next;
            cur.next = temp;
            temp = cur;
            cur = l1;
        }
        return temp;

    }
    public void Merge(ListNode l1, ListNode l2) {
        ListNode temp =null;
        while(l2 != null){
            temp = l1.next;
            l1.next = l2;
            l1 = l2;
            l2 = temp;

        }
    }
   
}