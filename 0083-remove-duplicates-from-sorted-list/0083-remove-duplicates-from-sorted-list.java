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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = head;
        if(head == null)
            return head;
        ListNode temp = head.next;
        while(temp != null){
            if(head.val == temp.val)
                temp = temp.next;
            else{
                head.next = temp;
                head = head.next;
                temp = temp.next;
            }

        }
        head.next = null;
        return res;
    }
}