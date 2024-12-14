import java.util.*;
public class DequeDS{
    public static void main(String args[]){
        // Deque<Integer> deque= new LinkedList<>();
        Deque<Integer> deque= new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
        System.out.println("First: "+deque.getFirst());
        System.out.println("Last: "+deque.peekLast());
        deque.removeFirst();
        deque.removeLast();
        System.out.println("First: "+deque.peekFirst());
        System.out.println("Last: "+deque.peekLast());
    }
}