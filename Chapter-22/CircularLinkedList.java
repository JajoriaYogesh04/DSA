public class CircularLinkedList{
    public class Node{
        int data;
        Node next;
    }
    public Node last;
    public void addEmpty(int data){
        if(last!=null){
            return;
        }
        Node newNode= new Node();
        newNode.data= data;
        last= newNode;
        newNode.next= last;
    }
    public void addFirst(int data){
        if(last==null){
            addEmpty(data);
            return;
        }
        Node newNode= new Node();
        newNode.data= data;
        newNode.next= last.next;             //newNode.next= tail.next;
        last.next= newNode;
    }
    public void addLast(int data){
        if(last==null){
            addEmpty(data);
            return;
        }
        Node newNode= new Node();
        newNode.data= data;
        newNode.next= last.next;
        last.next= newNode;
        last= newNode;
    }
    public void print(){
        if(last==null){
            System.out.println("null");
            return;
        }
        Node temp= last.next;
        do{
            System.out.print(temp.data+"->");
            temp= temp.next;
        }while(temp!=last.next);
        System.out.println("circular");
    }
    public static void main(String args[]){
        CircularLinkedList cll= new CircularLinkedList();
        cll.print();
        cll.addEmpty(0);
        cll.addFirst(1);
        cll.addFirst(2);
        cll.addFirst(3);
        cll.addLast(4);
        cll.addLast(5);
        cll.print();
    }
}