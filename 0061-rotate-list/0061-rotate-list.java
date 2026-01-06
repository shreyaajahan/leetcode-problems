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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode prev,curr,temp;
        curr=head;
        prev=null;
        int n=1;
        if(head==null || head.next==null || k==0) return head;
            while(curr.next!=null)
            {
               prev=curr;
               curr=curr.next;
               n++;
            }
            k=k%n;
            if(k==0) return head;
            int steps = n-k;
            int i=1;
            ListNode newTail=head;
            while(i<steps)
            {
                newTail=newTail.next;
                i++;
            }
            curr.next=head;
            head=newTail.next;
            newTail.next=null;
        return head;
    }
}