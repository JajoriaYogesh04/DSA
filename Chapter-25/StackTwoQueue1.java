import java.util.*;
public class StackTwoQueue1{
    public static class Stack{
        static Queue<Integer> q1= new LinkedList<>();
        static Queue<Integer> q2= new LinkedList<>();
        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }int top=0;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top= q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    top= q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top=0;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top= q1.remove();
                    q2.add(top);    
                }
            }
            else{
                while(!q2.isEmpty()){
                    top= q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }
    public static void main(String args[]){
        Stack stack = new Stack();

        // Test case 1: Push elements
        System.out.println("Pushing 1, 2, 3 into the stack:");
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Test case 2: Peek top element
        System.out.println("Top element (peek): " + stack.peek()); // Expected: 3

        // Test case 3: Pop elements
        System.out.println("Popping top element: " + stack.pop()); // Expected: 3
        System.out.println("Popping top element: " + stack.pop()); // Expected: 2

        // Test case 4: Peek after some pops
        System.out.println("Top element (peek): " + stack.peek()); // Expected: 1

        // Test case 5: Push more elements
        System.out.println("Pushing 4, 5 into the stack:");
        stack.push(4);
        stack.push(5);

        // Test case 6: Pop all elements
        System.out.println("Popping elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Test case 7: Pop from empty stack
        System.out.println("Popping from an empty stack: " + stack.pop()); // Expected: Stack is Empty, -1
    }
}