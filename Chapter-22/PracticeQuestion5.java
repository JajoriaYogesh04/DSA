public class PracticeQuestion5 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public static void print(Node head){
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
    public static Node sortedMerge(Node head1, Node head2){
        if(head1==null){
            return head2;
        }
        else if(head2==null){
            return head1;
        }
        Node merge;
        if(head1.data<=head2.data){
            merge= head1;
            merge.next= sortedMerge(head1.next, head2);
        }
        else{
            merge= head2;
            merge.next= sortedMerge(head1, head2.next);
        }
        return merge;
    }
    public static Node MergeLists(Node arr[], int k){
        Node head= arr[0];
        for(int i=1; i<k; i++){
            head= sortedMerge(head, arr[i]);
        }
        return head;
    }
    public static void main(String args[]){
        int k=3;
        int n=4;
        Node arr[]= new Node[k];
        arr[0]= new Node(1);
        arr[0].next= new Node(3);
        arr[0].next.next= new Node(5);
        arr[0].next.next.next= new Node(7);
        arr[1]= new Node(2);
        arr[1].next= new Node(4);
        arr[1].next.next= new Node(6);
        arr[1].next.next.next= new Node(8);
        arr[2]= new Node(0);
        arr[2].next= new Node(9);
        arr[2].next.next= new Node(10);
        arr[2].next.next.next= new Node(11);
        for(int i=0; i<k; i++){
            print(arr[i]);
        }
        Node head= MergeLists(arr, k);
        print(head);
    }
}
