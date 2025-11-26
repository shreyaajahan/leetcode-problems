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
        ListNode slow = new ListNode();
        slow=head;
        int len=0;
        while(slow!=null)
        {
            len++;
            slow=slow.next;
           
        }
        int node = len-n;
        ListNode prev = new ListNode();
        ListNode curr = new ListNode();
        prev=null;
        curr=head;
        while(node>0)
        {
            prev=curr;
            curr=curr.next;
            node--;
        }
        if(prev!=null)prev.next=curr.next;
        else head = curr.next;
        return head;
    }
}