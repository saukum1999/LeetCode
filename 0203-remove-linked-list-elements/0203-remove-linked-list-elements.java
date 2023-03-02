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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        
        ListNode res = head;
        ListNode temp = head;

        if(head != null)
            head = head.next;

        while(head != null){
            if(head.val == val){
                while( head != null && head.val == val){
                    head = head.next;
                }
            }
            temp.next = head;
            temp = temp.next;
            if(head != null)
            head = head.next;
        }
        return res;

    }
}