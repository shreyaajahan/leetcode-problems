/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node curr = head;
        Node prev = null;
        Node res = null;

        Map<Node,Node> mp = new HashMap<>();

        while(curr!=null)
        {
            Node newNode = new Node(curr.val);
            mp.put(curr,newNode);
            if(prev==null) res = newNode;
            else prev.next = newNode;
            prev = newNode;
            curr = curr.next;
        }
        curr = head;
        Node temp = res;

        while(curr!=null)
        {
            temp.random = mp.get(curr.random);
            temp = temp.next;
            curr = curr.next;
        }
        return res;
    }
}