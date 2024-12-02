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
    public static int size(Node head){
        Node temp= head;
        int i=0;
        while(temp!=null){
            temp= temp.next;
            i++;
        }
        return i;
    }
    public static int intersectionNode(Node head1, Node head2){
        if(head1==null || head2==null){
            return -1;
        }
        int size1= size(head1);
        int size2= size(head2);
        System.out.println("size head1: "+size1);
        System.out.println("size head2: "+size2);
        int offset= 0;
        Node longList= null;
        Node shortList= null;
        if(size1>=size2){
            longList= head1;
            shortList= head2;
            offset= size1-size2;
        }
        else{
            longList= head2;
            shortList= head1;
            offset= size2- size1;
        }
        Node tempLong= longList;
        int i=0;
        while(i<offset){
            tempLong= tempLong.next;
            i++;
        }
        while(tempLong!= null && shortList!= null){
            if(tempLong==shortList){
                return tempLong.data;
            }
            tempLong= tempLong.next;
            shortList= shortList.next;
        }
        return -1;
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
        System.out.println("Intersect At: "+intersectionNode(head1, head2));
    }
}