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
    public boolean isPalindrome(ListNode head) {
        ListNode st = null;
        ListNode temp = head.next;
        ListNode prev = head;
        int size = 1;

        while(head != null && head.next != null){
            head = head.next.next;
            prev.next = st;
            st = prev;
            prev = temp;
            temp = temp.next;
        }
        if(head != null)
            prev = prev.next;
        
        while(prev != null){
            if(st.val != prev.val)
                return false;
            st = st.next;
            prev = prev.next;
        }
        return true;
        
    }

}