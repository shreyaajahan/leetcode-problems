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
        ListNode curr, prev, next, newHead;
        curr=head;
        prev=null;
        next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode swapPairs(ListNode head) {
        ListNode start=head,prev=null,temp=null,curr=head;
        int count =1;
        while(curr!=null)
        {
            if(count%2==0)
            {
                temp=curr.next;
                curr.next=null;
                ListNode rev=reverseList(start);
                if(prev!=null) prev.next=rev;
                else head = rev;
                prev = start;
                start=curr=temp;
            }
            else
            {
                curr=curr.next;
            }
            count++;
        }
        if(temp!=null)prev.next=temp;
        return head;
    }
}