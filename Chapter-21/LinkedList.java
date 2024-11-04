public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    
    public static void addFirst(int data){
        //Create new Node
        Node newNode= new Node(data);
        //If Single Node Linked List
        if(head==null){
            head=tail=newNode;
            return;
        }
        //newNode->next->head
        newNode.next= head;
        //head->newNode
        head= newNode;
    }
    public static void main(String args[]){
        LinkedList ll= new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}