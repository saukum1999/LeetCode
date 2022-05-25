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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp = new ListNode();
        temp = head;
        int count = 0;
        int count1 = 0;
        
        
        
        while(head != null){
            count++;
            
            head = head.next;
        }
        if (count == 1){
            return null;
        }
        if(count == n)
            return temp.next;
        count -= n;
        head = temp;
        
        while(head != null ){
            count1++;
            if(count1 == count){
                head.next = head.next.next;
                break;
            }
            head = head.next;
        }

        return temp;
    }
}