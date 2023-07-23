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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k==1){
            return head;
        }
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode previous = temp;
        int count=0;
        ListNode current = head;
        while (current != null){
            count ++;
            if(count % k ==0){
            previous = reverse(previous, current.next);

            current = previous.next;
        }else{
            current = current.next;
            }
        }
        return temp.next;
        
    }
    private ListNode reverse(ListNode start, ListNode end){
        ListNode previous = start.next;
        ListNode current = previous.next;
        ListNode next;
        while(current!=end){
            next = current.next;
            current.next = start.next;
            start.next = current;
            current = next;
        }
        previous.next = end;
        return previous;
    }
}
