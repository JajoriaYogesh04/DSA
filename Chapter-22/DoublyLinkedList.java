public class DoublyLinkedList{
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data= data;
            this.next= null;
            this.prev= null;
        }
    }
    public Node head;
    public Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head= tail= newNode;
            return;
        }
        newNode.next= head;
        head.prev= newNode;
        head= newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("null");
            return;
        }
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        DoublyLinkedList dll= new DoublyLinkedList();
        dll.print();
        dll.addFirst(1);
        dll.print();
        dll.addFirst(2);
        dll.print();
        dll.addFirst(3);
        dll.print();
        System.out.println("size: "+size);
    }
}