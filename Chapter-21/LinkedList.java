public class LinkedList{
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
    static int size;
    public static void addFirst(int data){
        //Create new Node
        Node newNode= new Node(data);
        size++;
        //If Empty Linked List
        if(head==null){
            head=tail=newNode;
            return;
        }
        //newNode->next->head
        newNode.next= head;
        //head->newNode
        head= newNode;
    }
    public static void addLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail= newNode;
            return;
        }
        tail.next= newNode;
        tail= newNode;
    }
    public static void print(){
        if(head==null){                         //Empty LL
            System.out.println("null");
            return;
        }                                       //temp->head
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"->");   
            temp= temp.next;                    
        }
        System.out.println("null");
    }
    public static void addMiddle(int data, int idx){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp= head;
        int i=0; 
        while(i<idx-1){
            temp= temp.next;
            i++;
        }
        newNode.next= temp.next;
        temp.next= newNode;
    }
    public static int removeHead(){
        if(size==0){
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val= head.data;
            head= tail= null;
            size=0;
            return val;
        }
        int val= head.data;
        head= head.next;
        size--;
        return val;
    }
    public static int removeLast(){
        if(size==0){
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val= head.data;
            head= tail= null;
            size=0;
            return val;
        }
        Node temp= head;
        int i= 0;
        while(i<size-2){
            temp= temp.next;
            i++;
        }
        int val= temp.next.data;                //tail.data
        temp.next= null;
        tail= temp;
        size--;
        return val;
    }
    public static int remove(int idx){
        if(idx==0){
            return removeHead();
        }
        Node temp= head;
        int i=0;
        while(i<idx-1){
            temp= temp.next;
            i++;
        }
        Node rem= temp.next;
        temp.next= rem.next;
        rem.next= null;
        size--;
        return rem.data;
    }
    public static int itrSearch(int key){
        Node temp= head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp= temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String args[]){
        LinkedList ll= new LinkedList();
        print();
        ll.addFirst(2);
        print();
        ll.addFirst(1);
        print();
        ll.addLast(3);
        print();
        ll.addLast(4);
        print();
        ll.addMiddle(5, 2);
        print();
        ll.addMiddle(6, 5);             //Add middle for for ad last
        print();
        ll.addMiddle(0, 0);             //Add Middle do not work for add first
        print();
        System.out.println("Size: "+size);
        // ll.remove(3);
        // print();
        System.out.println("Removed: "+ll.removeHead());
        print();
        // System.out.println(size);
        System.out.println("Removed: "+ll.removeLast());
        print();
        System.out.println("Removed: "+ll.remove(2));
        print();
        System.out.println(ll.itrSearch(3));
    }
}