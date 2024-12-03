public class PracticeQuestion4 {
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
    public void oddEven(){
        Node even= new Node(0);
        Node odd= new Node(0);
        Node eventail= even;
        Node oddtail= odd;
        Node temp= head;
        while(temp!=null){
            if(temp.data%2==0){
                eventail.next= temp;
                eventail= eventail.next;
            }
            else{
                oddtail.next= temp;
                oddtail= oddtail.next;
            }
            temp= temp.next;
        }
        eventail.next= odd.next;
        oddtail.next= null;
        head= even.next;
    }
    public static void main(String args[]){
        PracticeQuestion4 pq= new PracticeQuestion4();
        pq.addLast(8);
        pq.addLast(12);
        pq.addLast(99);
        pq.addLast(10);
        pq.addLast(5);
        pq.addLast(4);
        pq.addLast(990);
        pq.addLast(1);
        pq.addLast(6);
        pq.print();
        pq.oddEven();
        pq.print();
    }
}