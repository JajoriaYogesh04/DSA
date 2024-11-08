public class DetectingCycle{
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
    public static boolean isCycle(){
        Node slow= head;
        Node fast= head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        DetectingCycle dc= new DetectingCycle();
        dc.addLast(1);
        dc.addLast(2);
        dc.addLast(3);
        dc.addLast(4);
        dc.addLast(5);
        dc.addLast(6);
        dc.addLast(7);
        tail.next= head;
        // dc.print();
        System.out.println(dc.isCycle() ? "CYCLIC" : "NON CYCLIC");
    }
}