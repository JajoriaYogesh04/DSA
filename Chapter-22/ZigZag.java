public class ZigZag{
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
        if(head==null){
            System.out.println("null");
        }
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public static void zigZag(){
        //mid
        Node slow= head;
        Node fast= head.next;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        Node midNode= slow;
        //reverse
        Node prev= null;
        Node curr= midNode.next;
        midNode.next= null;
        Node next;
        while(curr!=null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        Node left= head;
        Node right= prev;
        Node nextLeft;
        Node nextRight;
        //alternate
        while(left!=null && right!=null){
            nextLeft= left.next;
            left.next= right;
            nextRight= right.next;
            right.next= nextLeft;
            left= nextLeft;
            right= nextRight;
        }
    }
    public static void main(String args[]){
        ZigZag zz= new ZigZag();
        zz.addLast(1);
        zz.addLast(2);
        zz.addLast(3);
        zz.addLast(4);
        zz.addLast(5);
        zz.addLast(6);
        zz.print();
        zz.zigZag();
        zz.print();
    }
}