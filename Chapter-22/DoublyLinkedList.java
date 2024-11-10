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
    public static void main(String args[]){
        DoublyLinkedList dll= new DoublyLinkedList();
    }
}