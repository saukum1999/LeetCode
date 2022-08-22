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
    public ListNode reverseList(ListNode head) {
        
        if(head == null)
            return head;

        ListNode temp = new ListNode();
        ListNode rev = new ListNode();

        
        temp = head;
        rev = head;
        head = head.next;
        temp.next=null;
        
        while(head != null){

            temp = head;
            head = head.next;
            temp.next = rev;
            rev = temp;
        }

        return rev;

    }
}

