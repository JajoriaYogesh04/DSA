public class PracticeQuestion1{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public static void print(Node head){
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
    public static Node intersectionNode(Node head1, Node head2){
        while(head1!=null){
            Node temp= head2;
            while(temp!=null){
                if(temp==head1){
                    return head1;
                }
                temp= temp.next;
            }
            head1= head1.next;
        }
        return null;
    }
    public static void main(String args[]){
        Node head1= new Node(1);
        head1.next= new Node(2);
        head1.next.next= new Node(3);
        Node head2= new Node(4);
        head2.next= new Node(5);
        Node intersect= new Node(8);
        head1.next.next.next= intersect;
        head2.next.next= intersect;
        intersect.next= new Node(7);
        print(head1);
        print(head2);
        Node intersecNode= intersectionNode(head1, head2);
        System.out.println("Intersect At: "+intersecNode.data);
    }
}