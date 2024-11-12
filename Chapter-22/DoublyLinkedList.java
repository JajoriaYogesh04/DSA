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
    public void addLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head= tail= newNode;
            return;
        }
        tail.next= newNode;
        newNode.prev= tail;
        tail= newNode;
    }
    public int removeFirst(){
        if(head==null){
            return Integer.MIN_VALUE;
        }
        if(head.next==null){
            int val= head.data;
            head= tail= null;
            size--;
            return val;
        }
        int val= head.data;
        head= head.next;
        head.prev= null;
        size--;
        return val;
    }
    public int removeLast(){
        if(head==null){
            return Integer.MIN_VALUE;
        }
        if(head.next==null){
            int val= head.data;
            head= tail= null;
            size--;
            return val;
        }
        int val= tail.data;
        Node temp= tail.prev; 
        temp.next= null;
        tail= temp;
        size--;
        return val;
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
    public void printCircular() {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        } while (temp != head); // Stop when we return to the head node
        System.out.println("(circular)");
    }
    public void reverse(){
        Node prev= null;
        Node curr= tail= head;
        Node next;
        while(curr!=null){
            next= curr.next;
            curr.next= prev;
            curr.prev= next;
            prev= curr;
            curr= next;
        }
        head= prev;

    }
    public void makeCircular(){
        if(tail!=null && tail.next==null){
            tail.next= head;
            head.prev= tail;    
        }
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
        dll.addLast(4);
        dll.print();
        dll.addLast(5);
        dll.print();
        dll.addLast(6);
        dll.print();
        System.out.println("size: "+size);
        System.out.println("remove: "+dll.removeFirst());
        dll.print();
        System.out.println("size: "+size);
        System.out.println("remove: "+dll.removeLast());
        dll.print();
        System.out.println("size: "+size);
        dll.reverse();
        dll.print();
        dll.makeCircular();
        dll.printCircular();
    }
}