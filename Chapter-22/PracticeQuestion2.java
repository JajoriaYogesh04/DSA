public class PracticeQuestion2 {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public Node head;
    public Node tail;
    public void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head= tail= newNode;
            return;
        }
        tail.next= newNode;
        tail= newNode;
        return;
    }
    public void print(){
        if(head==null){
            System.out.println("null");
            return;
        }
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public void deleteAfter(int m, int n){
        Node curr= head;
        while(curr!=null){
            int move= 1;
            while(move<m && curr!=null){
                curr= curr.next;
                move++;
            }
            if(curr==null){
                return;
            }
            Node del= curr.next;
            int delete= 0;
            while(delete<n && del!=null){
                del= del.next;
                delete++;
            }
            curr.next= del;
            curr= del;
        }
    }
    public static void main(String args[]){
        PracticeQuestion2 pq= new PracticeQuestion2();
        pq.addLast(1);
        pq.addLast(2);
        pq.addLast(3);
        pq.addLast(4);
        pq.addLast(5);
        pq.addLast(6);
        pq.addLast(7);
        pq.addLast(8);
        pq.print();
        int m= 2;
        int n= 2;
        pq.deleteAfter(m, n);
        pq.print();
    }
}