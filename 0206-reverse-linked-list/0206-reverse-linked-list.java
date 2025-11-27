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
        ListNode curr,prev,resHead,resTail;
        resHead=null;resTail=null;

        while(head!=null)
        {
            curr=head;
            prev=null;
            while(curr.next!=null)
            {
                prev=curr;
                curr=curr.next;
            }
            if(prev!=null)
            prev.next=curr.next;
            else
            head=curr.next;

            if(resHead==null)
            {
                resHead=curr;
                resTail=curr;
            }
            else
            {
                resTail.next=curr;
                resTail=curr;
            }
        }
        return resHead;
    }
}