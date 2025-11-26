/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int len = 0;
        ListNode * curr = head;
        ListNode * prev = NULL;
        while(curr!=NULL)
        {
            len++;
            curr=curr->next;
        }
        int node = len-n;
        curr=head;
        
        while(node>0)
        {
            prev=curr;
            curr=curr->next;
            node--;
        }
        if(prev) prev->next=curr->next;
        else head=curr->next;
        return head;
    }
};