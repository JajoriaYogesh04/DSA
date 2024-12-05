import java.util.*;
public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> s, int k){
        if(s.isEmpty()){
            s.push(k);
            return;
        }
        int top= s.pop();
        pushAtBottom(s, k);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top= s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top= s.pop();
        System.out.println(top);
        printStack(s);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s= new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println("Stack:-");
        printStack(s);
        reverseStack(s);
        System.out.println("Reverse Stack:-");
        printStack(s);
    }
}