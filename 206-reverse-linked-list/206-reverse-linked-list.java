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


// class Solution {
//     public ListNode reverseList(ListNode head) {
        
//         ListNode forward = new ListNode();
//         ListNode dummy = new ListNode();
//         if (head == null || head.next == null )
//             return head;
//         forward = head.next;
//         dummy = null;
        
//         while (true){
            
//             if(forward == null){
//                 head.next = dummy;
//                 break;
//             }
//             head.next = dummy;
//             dummy = head;
//             head = forward;
//             forward = forward.next;
            
            
//         }
        
//         return head;
        
        
//     }
// }