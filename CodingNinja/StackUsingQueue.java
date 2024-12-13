import java.util.*;
public class Solution{
    static class Stack {
        // Define the data members.
        Queue<Integer> q1;
        Queue<Integer> q2;
        int size=0;
        public Stack() {
            // Implement the Constructor.
            q1= new LinkedList<>();
            q2= new LinkedList<>();
        }

        /*----------------- Public Functions of Stack -----------------*/

        public int getSize() {
            // Implement the getSize() function.
            return size;
        }

        public boolean isEmpty() {
            // Implement the isEmpty() function.
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int element) {
            // Implement the push(element) function.
            if(q1.isEmpty()){
                q1.add(element);
                size++;
                while(!q2.isEmpty()){
                    q1.add(q2.remove());
                }
            }
            else{
                q2.add(element);
                size++;
                while(!q1.isEmpty()){
                    q2.add(q1.remove());
                }
            }
        }

        public int pop() {
            // Implement the pop() function.
            if(isEmpty()){
                return -1;
            }
            size--;
            return q1.isEmpty()?q2.remove():q1.remove();
        }

        public int top() {
            // Implement the top() function.
            if(isEmpty()){
                return -1;
            }
            return q1.isEmpty()?q2.peek():q1.peek();
        }
    }
}