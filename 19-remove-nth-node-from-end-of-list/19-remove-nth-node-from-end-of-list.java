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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null)
            return null;
        // else if (n == head.size())
        //     return head.next;

        if(head.next == null && n ==1)
            return null;
        int count = 0;
        ListNode frwd = head;
        ListNode temp = head;

        while(count!=n&& frwd.next!=null){
            frwd = frwd.next;
            count++;
            // n--;
        }

        while(frwd.next!= null){
            frwd = frwd.next;
            temp = temp.next;
            count++;
        }

        if(count+1 == n)
            return head.next;
        temp.next = temp.next.next;
        return head;

    }
}