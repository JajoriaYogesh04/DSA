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
        //If Empty Linked List
        if(head==null){
            head=tail=newNode;
            return;
        }
        //newNode->next->head
        newNode.next= head;
        //head->newNode
        head= newNode;
    }
    public static void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail= newNode;
            return;
        }
        tail.next= newNode;
        tail= newNode;
    }
    public static void print(){
        if(head==null){                         //Empty LL
            System.out.println("null");
            return;
        }                                       //temp->head
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"->");   
            temp= temp.next;                    
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        LinkedList ll= new LinkedList();
        print();
        ll.addFirst(2);
        print();
        ll.addFirst(1);
        print();
        ll.addLast(3);
        print();
        ll.addLast(4);
        print();
    }
}