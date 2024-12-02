public class CircularLinkedList{
    public class Node{
        int data;
        Node next;
    }
    public Node last;
    public void addEmpty(int data){
        if(last!=null){
            return;
        }
        Node newNode= new Node();
        newNode.data= data;
        last= newNode;
        newNode.next= last;
    }
    public void addFirst(int data){
        if(last==null){
            addEmpty(data);
            return;
        }
        Node newNode= new Node();
        newNode.data= data;
        newNode.next= last.next;           
        last.next= newNode;
    }
    public void addBetween(int data, int idx){
        if(last==null){
            addEmpty(data);
            return;
        }
        if(idx<=0){
            System.out.println("INVALID");
            return;
        }
        Node newNode= new Node();
        newNode.data= data;
        int i=0;
        Node temp= last.next;
        while(i<idx-1){
            temp=temp.next;
            i++;
            if(temp==last.next){
                System.out.println("OUT OF BOUND");
                return;
            }
        }
        newNode.next= temp.next;
        temp.next= newNode;
        if(temp==last){
            last= newNode;
        }
    }
    public void addLast(int data){
        if(last==null){
            addEmpty(data);
            return;
        }
        Node newNode= new Node();
        newNode.data= data;
        newNode.next= last.next;
        last.next= newNode;
        last= newNode;
    }
    public void deleteNode(int key){
        if(last==null){                     //empty
            return;
        }
        if(last.data== key && last.next== last){               //one node
            last= null;
            return;
        }
        Node temp= last;
        if(last.data==key){                                     //last node
            while(temp.next!=last){ 
                temp= temp.next;
            }
            temp.next= last.next;
            temp= last;
            return;
        }
        while(temp.next!= last && temp.next.data!=key){
            temp= temp.next;
        }
        if(temp.next.data==key){
            temp.next= temp.next.next;
            return;
        }
    }
    public void print(){
        if(last==null){
            System.out.println("null");
            return;
        }
        Node temp= last.next;
        do{
            System.out.print(temp.data+"->");
            temp= temp.next;    
        }while(temp!=last.next);
        System.out.println("circular");
    }
    public static void main(String args[]){
        CircularLinkedList cll= new CircularLinkedList();
        // cll.print();
        cll.addEmpty(0);
        cll.addFirst(1);
        cll.addFirst(2);
        cll.addFirst(3);
        cll.addLast(4);
        cll.addLast(5);
        cll.addBetween(6,3);
        cll.print();
        cll.deleteNode(5);
        cll.print();
        cll.deleteNode(6);
        cll.print();
        cll.deleteNode(3);
        cll.print();
    }
}