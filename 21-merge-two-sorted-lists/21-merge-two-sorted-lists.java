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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode temp = new ListNode();
        ListNode res = new ListNode();
        res = temp;

        if (l1 == null && l2 == null)
            return res.next;
        else if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            } else if (l2 == null) {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            }
        }

        return res.next;

    }
}


