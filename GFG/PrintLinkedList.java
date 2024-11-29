

/* Node is defined as
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/
/*
    Print elements of a linked list on console
    Head pointer input could be NULL as well for empty list
*/

class Solution {
    void display(Node head) {
        // add code here.
        if(head==null){
            return;
        }
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }
}