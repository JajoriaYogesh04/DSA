import java.util.*;
public class QueueDeque{
    public static class Queue{
        static Deque<Integer> deque= new LinkedList<>();
        public static void add(int data){
            deque.addLast(data);
        }
        public static int remove(){
            if(deque.isEmpty()){
                return -1;
            }
            return deque.removeFirst();
        }
        public static int peek(){
            if(deque.isEmpty()){
                return -1;
            }
            return deque.getFirst();
        }
    }
    public static void main(String args[]){
        // Test cases
        System.out.println("Is queue empty? " + Queue.deque.isEmpty()); // true

        // Add elements to the queue
        Queue.add(10);
        Queue.add(20);
        Queue.add(30);
        System.out.println("After adding 10, 20, 30:");
        System.out.println("Is queue empty? " + Queue.deque.isEmpty()); // false
        System.out.println("Peek: " + Queue.peek()); // 10

        // Remove elements from the queue
        System.out.println("Remove: " + Queue.remove()); // 10
        System.out.println("Peek after removal: " + Queue.peek()); // 20
        Queue.add(40);
        System.out.println("After adding 40:");
        System.out.println("Peek: " + Queue.peek()); // 20
        System.out.println("Remove: " + Queue.remove()); // 20
        System.out.println("Remove: " + Queue.remove()); // 30
        System.out.println("Remove: " + Queue.remove()); // 40

        // Edge case: Removing from an empty queue
        System.out.println("Remove from empty queue: " + Queue.remove()); // -1
        System.out.println("Is queue empty? " + Queue.deque.isEmpty()); // true
    }
}