public class QueueLinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public static class Queue{
        static Node head= null;
        static Node tail= null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data){
            Node newNode= new Node(data);
            if(head==null && tail==null){
                head=tail= newNode;
            }
            tail.next= newNode;
            tail= newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front= head.data;
            if(head==tail){
                head= tail= null;
            }
            else{
                head= head.next;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Remove: "+q.remove());
        q.add(4);
        System.out.println("Remove: "+q.remove());
        q.add(5);
        System.out.print("Queue: ");
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}