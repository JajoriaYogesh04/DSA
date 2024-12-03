

/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        if(head==null){
            Node newNode= new Node(x);
            head= newNode;
            return head;
        }
        if (head.next == null) {
            Node newNode = new Node(x);
            head.next = newNode;
            return head;
        }
        Node slow= head;
        Node fast= head.next;
        Node newNode= new Node(x);
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        newNode.next= slow.next;
        slow.next= newNode;
        return head;
    }
}