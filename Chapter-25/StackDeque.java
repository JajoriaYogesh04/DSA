import java.util.*;
public class StackDeque{
    public static class Stack{
        static Deque<Integer> deque= new LinkedList<>();
        public static void push(int data){
            deque.addLast(data);
        }
        public static boolean isEmpty(){
            return deque.isEmpty();
        }
        public static int pop(){
            if(deque.isEmpty()){
                return -1;
            }
            return deque.removeLast();
        }
        public static int peek(){
            if(deque.isEmpty()){
                return -1;
            }
            return deque.getLast();
        }
    }
    public static void main(String args[]){
        System.out.println("Is stack empty? " + Stack.isEmpty()); // true
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        System.out.println("After pushing 10, 20, 30:");
        System.out.println("Is stack empty? " + Stack.isEmpty()); // false
        System.out.println("Peek: " + Stack.peek()); // 30
        System.out.println("Pop: " + Stack.pop()); // 30
        System.out.println("Peek after pop: " + Stack.peek()); // 20
        Stack.push(40);
        System.out.println("After pushing 40:");
        System.out.println("Peek: " + Stack.peek()); // 40
        System.out.println("Pop: " + Stack.pop()); // 40
        System.out.println("Pop: " + Stack.pop()); // 20
        System.out.println("Pop: " + Stack.pop()); // 10
        System.out.println("Pop from empty stack: " + Stack.pop()); // -1
        System.out.println("Is stack empty? " + Stack.isEmpty()); // true
    }
}