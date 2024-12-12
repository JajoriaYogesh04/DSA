import java.util.*;
public class QueueTwoStack2{
    public static class Queue{
        static Stack<Integer> s1= new Stack<>();
        static Stack<Integer> s2= new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty() && s2.isEmpty();
        }
        public static void add(int data){
            s1.push(data);
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int top= s2.pop();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int top= s2.peek();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return top;
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