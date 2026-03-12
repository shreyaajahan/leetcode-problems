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
        ListNode curr = head;
        int len = 0;
        while(curr!=null)
        {
            curr=curr.next;
            len++;
        }
        curr=head;
        int node = len - n;
        if(len==n) return head.next;
        while(node>1)
        {
            curr=curr.next;
            node--;
        }
        curr.next=curr.next.next;
        return head;
    }
}