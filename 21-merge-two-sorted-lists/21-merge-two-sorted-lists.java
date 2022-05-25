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

        ListNode head = new ListNode();
        ListNode tmp = new ListNode();
        head = tmp;

        if (l1 == null && l2 == null)
            return null;
        else if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;

        while (l1 != null && l2 != null) {
            if (l2 == null || l1.val <= l2.val) {
                tmp.next = l1;
                l1 = l1.next;
                tmp = tmp.next;

            } else if (l1 == null || l1.val > l2.val) {
                tmp.next = l2;
                l2 = l2.next;
                tmp = tmp.next;
            }
        }

        while (l1 != null) {
            tmp.next = l1;
            l1 = l1.next;
            tmp = tmp.next;
        }

        while (l2 != null) {
            tmp.next = l2;
            l2 = l2.next;
            tmp = tmp.next;
        }

        return head.next;

    }
}