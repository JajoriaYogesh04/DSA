import java.util.*;
public class InterleaveTwoHalves{
    public static Queue<Integer> interleaveTwoHalves(Queue<Integer> q){
        int size= q.size();
        Queue<Integer> q2= new LinkedList<>();
        for(int i=0; i<size; i++){
            q2.add(q.remove());
        }
        while(!q2.isEmpty()){
            q.add(q2.remove());
            q.add(q.remove());
        }
        return q;
    }
    public static void printQueue(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int top= q.remove();
        System.out.print(top+" ");
        printQueue(q);
        q.add(top);
    }
    public static void main(String args[]){

        // Test case 1: Default case
        Queue<Integer> q1 = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            q1.add(i);
        }
        System.out.print("Test case 1: ");
        printQueue(interleaveTwoHalves(q1));
        System.out.println();

        // Test case 2: Empty queue
        Queue<Integer> q2 = new LinkedList<>();
        System.out.print("Test case 2 (Empty queue): ");
        printQueue(interleaveTwoHalves(q2));
        System.out.println();

        // Test case 3: Queue with 2 elements
        Queue<Integer> q3 = new LinkedList<>();
        q3.add(1);
        q3.add(2);
        System.out.print("Test case 3 (2 elements): ");
        printQueue(interleaveTwoHalves(q3));
        System.out.println();

        // // Test case 4: Queue with odd number of elements (will leave the last element in place)
        // Queue<Integer> q4 = new LinkedList<>();
        // for (int i = 1; i <= 9; i++) {
        //     q4.add(i);
        // }
        // System.out.print("Test case 4 (Odd number of elements): ");
        // printQueue(interleaveTwoHalves(q4));
        // System.out.println();

        // Test case 5: Queue with 1 element
        Queue<Integer> q5 = new LinkedList<>();
        q5.add(42);
        System.out.print("Test case 5 (1 element): ");
        printQueue(interleaveTwoHalves(q5));
        System.out.println();

        // Test case 6: Queue with 4 elements
        Queue<Integer> q6 = new LinkedList<>();
        for (int i = 1; i <= 4; i++) {
            q6.add(i);
        }
        System.out.print("Test case 6 (4 elements): ");
        printQueue(interleaveTwoHalves(q6));
        System.out.println();
    }
}