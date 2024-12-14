import java.util.*;
public class QueueReversal{
    // public static void queueReversal(Queue<Integer> q){
    //     if(q.isEmpty()){
    //         return;
    //     }
    //     int top= q.remove();
    //     queueReversal(q);
    //     q.add(top);
    // }
    public static void queueReversal(Queue<Integer> q){
        Stack<Integer> s= new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    } 
    public static void printQueue(Queue<Integer> q){
        Queue<Integer> temp= new LinkedList<>(q);
        while(!temp.isEmpty()){
            System.out.print(temp.remove()+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // Test Case 1: Normal case with multiple elements
        Queue<Integer> q1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original Queue:");
        printQueue(q1);
        queueReversal(q1);
        System.out.println("Reversed Queue:");
        printQueue(q1);

        // Test Case 2: Single element in the queue
        Queue<Integer> q2 = new LinkedList<>(Arrays.asList(10));
        System.out.println("\nOriginal Queue:");
        printQueue(q2);
        queueReversal(q2);
        System.out.println("Reversed Queue:");
        printQueue(q2);

        // Test Case 3: Empty queue
        Queue<Integer> q3 = new LinkedList<>();
        System.out.println("\nOriginal Queue (Empty):");
        printQueue(q3);
        queueReversal(q3);
        System.out.println("Reversed Queue (Empty):");
        printQueue(q3);

        // Test Case 4: Queue with duplicate elements
        Queue<Integer> q4 = new LinkedList<>(Arrays.asList(1, 2, 2, 3, 3, 4, 4));
        System.out.println("\nOriginal Queue:");
        printQueue(q4);
        queueReversal(q4);
        System.out.println("Reversed Queue:");
        printQueue(q4);
    }
}