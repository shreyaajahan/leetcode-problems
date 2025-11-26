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
        ListNode second,first,prev=null;
        second = first=head;
        while(n-->1)
        {
            second=second.next;
        }
        while(second!=null && second.next!=null)
        {
            prev=first;
            first=first.next;
            second=second.next;
        }
        if(prev!=null) prev.next=first.next;
        else head=first.next;
        return head;

    }
}