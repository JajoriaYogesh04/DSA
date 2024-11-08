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
        // temp.next= rem.next;
        // rem.next= null;
        temp.next= temp.next.next;
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
    public static int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx= helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public static int recSearch(int key){
        return helper(head, key);
    }
    public static void reverse(){
        Node prev= null;
        Node curr= tail= head;
        Node next;
        while(curr!=null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        head= prev;
    }
    public static int deleteNthFromLast(int n){
        int sz= 0;
        Node temp= head;
        while(temp!=null){
            temp= temp.next;
            sz++;
        }
        if(n==sz){
            int val= head.data;
            head= head.next;
            return val;
        }
        int i=0;
        int toFind= sz-n;
        Node prev= head;
        while(i<toFind-1){
            prev= prev.next;
            i++;
        }
        int val= prev.next.data;
        prev.next= prev.next.next;
        size--;
        return val;
    }
    public static Node findMidNode(){
        Node slow= head;
        Node fast= head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    public static boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //I: find mid
        Node midNode= findMidNode();
        //II: reverse half
        Node prev= null;
        Node curr= midNode;
        Node next;
        while(curr!=null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        // midNode.next= null;
        //III: cheack halfs
        Node right= prev;
        Node left= head;
        while(right!=null){
            if(right.data != left.data){
                return false;
            }
            left= left.next;
            right= right.next;
        }
        return true;
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
        System.out.println("Index: "+ll.itrSearch(3));
        System.out.println("Index: "+ll.recSearch(3));
        ll.reverse();
        print();
        System.out.println("Removed: "+ll.deleteNthFromLast(2));
        print();
        // ll.addLast(1);
        ll.addLast(3);
        ll.addLast(4);
        print();
        System.out.println("Mid: "+findMidNode().data);
        System.out.println(ll.checkPalindrome() ? "PALINDROME" : "NOT PALINDROME");
    }
}