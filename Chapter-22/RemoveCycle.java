public class RemoveCycle {
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
    public static void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head= tail= newNode;
            return;
        }
        tail.next= newNode;
        tail= newNode;
    }
    public static void print(){
        Node temp= head;
        if(head==null){
            System.out.println("null");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public static void makeCyclic(int idx){
        Node temp= head;
        int i=0;
        while(i<idx){
            temp= temp.next;
            i++;
        }
        tail.next= temp;
    }
    public static void main(String args[]){
        RemoveCycle rc= new RemoveCycle();
        rc.addLast(0);
        rc.addLast(1);
        rc.addLast(2);
        rc.addLast(3);
        rc.addLast(4);
        rc.addLast(5);
        rc.addLast(6);
        rc.addLast(7);
        rc.print();
        rc.makeCyclic(2);
        
        print();
    }
}