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
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode temp = head;
        head = head.next;
        while(head != null && head.next != null){
            if(head == temp)
                return true;
            head = head.next.next;
            temp = temp.next;
        }
        return false;
    }
}