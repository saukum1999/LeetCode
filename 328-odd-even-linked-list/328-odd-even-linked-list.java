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
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        // if( head.next.next!=null){
        ListNode odd = new ListNode();
        ListNode even = new ListNode();
        ListNode res = head;
        ListNode odd_start = head;
        ListNode even_start = head.next;
        // }
        while(head.next != null && head.next.next != null){
            // head = res;
            // res = res.
            if(odd!=null)           
                odd.next = head;
            odd = head;
            
            if(even!=null)
                even.next = head.next;
            even = head.next;
            head = head.next.next;
            
            if(head.next == null || head.next.next == null){
                if(odd!=null)           
                odd.next = head;
            odd = head;
            
            if(even!=null)
                even.next = head.next;
            even = head.next;
            }
        }
        
//         if(head.next != null){
//             even.next = head.next;
            
//         }
            
        odd.next = even_start;
        
        
        return odd_start;
        
    }
}