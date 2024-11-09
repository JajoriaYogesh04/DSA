import java.util.LinkedList;
public class MergeSort{
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
    public static void addFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head= tail= newNode;
            return;
        }
        newNode.next= head;
        head= newNode;
    }
    public static void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail= newNode;
            return;
        }
        tail.next= newNode;
        tail= newNode;
    }
    public static void print(){
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
    private static Node getMidNode(Node head){
        Node slow= head;
        Node fast= head.next;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    private static Node merge(Node leftPtr, Node rightPtr){
        Node mergeLL= new Node(-1);
        Node temp= mergeLL;
        while(leftPtr!=null && rightPtr!=null){
            if(leftPtr.data<=rightPtr.data){
                temp.next= leftPtr;
                leftPtr= leftPtr.next;
                temp= temp.next;
            }
            else{
                temp.next= rightPtr;
                rightPtr= rightPtr.next;
                temp= temp.next;
            }
        }
        while(leftPtr!=null){
            temp.next= leftPtr;
            leftPtr= leftPtr.next;
            temp= temp.next;
        }
        while(rightPtr!=null){
            temp.next= rightPtr;
            rightPtr= rightPtr.next;
            temp= temp.next;
        }
        return mergeLL.next;
    }
    public static Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //mid node
        Node midNode= getMidNode(head);
        //left-right
        Node rightHead= midNode.next;
        midNode.next= null;
        Node newLeft= mergeSort(head);
        Node newRight= mergeSort(rightHead);
        //merge
        return merge(newLeft, newRight);
    }
    public static void main(String args[]){
        MergeSort ms= new MergeSort();
        ms.addFirst(9);
        ms.addLast(11);
        ms.addLast(20);
        ms.addLast(8);
        ms.addLast(3);
        ms.print();
        ms.head= ms.mergeSort(ms.head);
        ms.print();
    }
}