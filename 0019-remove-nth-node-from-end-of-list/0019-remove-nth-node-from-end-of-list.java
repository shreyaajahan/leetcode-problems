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
        ListNode prev = null;
        int len=0;
        while(curr!=null)
        {
            len++;
            curr=curr.next;
        }
        int node = len-n;
        curr = head;
        while(node>0)
        {
            prev=curr;
            curr=curr.next;
            node--;
        }
        if(prev!=null)
        {
            prev.next=curr.next;
            curr=curr.next;
        }
        else
        {
            head=curr.next;
        }
        return head;
    }
}