/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int l1 = size(headA);
        int l2 = size(headB);
        int i = Math.abs(l1-l2);
        if(l1 > l2) while(i-- > 0) headA = headA.next;
        else if(l2 > l1) while(i-- > 0) headB = headB.next;
        
        while(headA != null || headB != null){
            if(headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    public int size(ListNode a){
        int len = 0;
        while(a != null){ 
            len++;
            a = a.next;
        }
        return len;
    }
}