import java.util.*;
public class ReversingFirstKElementsOfQueue{
    public static Queue<Integer> reversingFirstKElementsOfQueue(Queue<Integer> q, int k){
        Stack<Integer> s= new Stack<>();
        int n= q.size();
        if (k < 0 || k > q.size()) {
            throw new IllegalArgumentException("Invalid value of k");
        }
        for(int i=0; i<k; i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i=0; i<n-k; i++){
            q.add(q.remove());
        }
        return q;
    }
    public static void printQueue(Queue<Integer> q){
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        System.out.println("Test Case 1:");
        Queue<Integer> q1 = new LinkedList<>();
        for (int i = 10; i <= 100; i += 10) {
            q1.add(i);
        }
        int k1 = 5;
        printQueue(reversingFirstKElementsOfQueue(q1, k1));  // Expected: 50 40 30 20 10 60 70 80 90 100

        System.out.println("Test Case 2 (k=0):");
        Queue<Integer> q2 = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        int k2 = 0;
        printQueue(reversingFirstKElementsOfQueue(q2, k2));  // Expected: 10 20 30 40 50

        System.out.println("Test Case 3 (k=Queue size):");
        Queue<Integer> q3 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k3 = 5;
        printQueue(reversingFirstKElementsOfQueue(q3, k3));  // Expected: 5 4 3 2 1

        System.out.println("Test Case 4 (Single Element Queue):");
        Queue<Integer> q4 = new LinkedList<>(Arrays.asList(99));
        int k4 = 1;
        printQueue(reversingFirstKElementsOfQueue(q4, k4));  // Expected: 99

        System.out.println("Test Case 5 (k exceeds queue size):");
        try {
            Queue<Integer> q5 = new LinkedList<>(Arrays.asList(10, 20, 30));
            int k5 = 4;  // Invalid k
            printQueue(reversingFirstKElementsOfQueue(q5, k5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Expected: Invalid value of k
        }
    }
}