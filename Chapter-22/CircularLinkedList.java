public class CircularLinkedList{
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
        }
    }
    public Node head;
    public Node tail;
    public void addFirst(int data){
        Node newNode= new Node(data);
        if(head== null){
            head= tail= newNode;
            tail.next= head;
            return;
        }
        newNode.next= head;             //newNode.next= tail.next;
        head= newNode;
        tail.next= head;
    }
    public void print(){
        Node temp= head;
        if(head==null){
            System.out.println("null");
            return;
        }
        do{
            System.out.print(temp.data+"->");
            temp= temp.next;
        }while(temp!=head);
        System.out.println("circular");
    }
    public static void main(String args[]){
        CircularLinkedList cll= new CircularLinkedList();
        cll.print();
        cll.addFirst(1);
        cll.addFirst(2);
        cll.addFirst(3);
        cll.print();
    }
}