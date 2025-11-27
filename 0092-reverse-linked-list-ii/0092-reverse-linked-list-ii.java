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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count = 1;
        ListNode start,end,prev=null;
        start=head;
        ListNode curr =head;
        if(left==right) return head;
        while(curr!=null &&count<right)
        {
            if(count<left) prev=curr;
            if(count==left)
               start=curr;
            curr=curr.next;
            count++;
        }
        ListNode temp =curr.next;
        curr.next=null;
        ListNode rev =reverseList(start);
        if(prev!=null)
        prev.next=rev;
        else head = rev;
        start.next=temp;

        return head;
    }
}