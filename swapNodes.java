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
    public ListNode swapPairs(ListNode head) {
         ListNode n = helper(head);
        return n; 
    }
    
    public ListNode helper(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }    
        
        ListNode tmp = head;
        ListNode next = head.next;
        
        head.next = next.next;
        next.next = tmp; 
        head.next = helper(head.next); 
        return next;
    }
        

}
