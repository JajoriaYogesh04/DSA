public class PracticeQuestion3 {
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
    public void swapKeys(int x, int y){
        if(x==y){
            return;
        }
        Node ptrx= head;
        Node prevx= null;
        while(ptrx!=null && ptrx.data!=x){
            prevx= ptrx;
            ptrx= ptrx.next;
        }
        Node ptry= head;
        Node prevy= null;
        while(ptry!=null && ptry.data!=y){
            prevy= ptry;
            ptry= ptry.next;
        }
        // System.out.println(prevx.data);
        // System.out.println(ptrx.data);
        // System.out.println(prevy.data);
        // System.out.println(ptry.data);
        if(ptrx==null || ptry==null){
            return;
        }
        if(prevx!=null){
            prevx.next= ptry;
        }
        else{
            head= ptry;
        }
        if(prevy!=null){
            prevy.next= ptrx;
        }
        else{
            head= ptrx;
        }
        Node temp= ptry.next;
        ptry.next= ptrx.next;
        ptrx.next= temp;
    }
    public static void main(String args[]){
        PracticeQuestion3 pq= new PracticeQuestion3();
        pq.addLast(1);
        pq.addLast(2);
        pq.addLast(3);
        pq.addLast(4);
        pq.addLast(5);
        pq.addLast(6);
        pq.print();
        pq.swapKeys(6, 3);
        pq.print();
    }
}