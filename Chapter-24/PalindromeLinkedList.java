import java.util.*;
public class PalindromeLinkedList {
    public static class Node{
        char data;
        Node next;
        public Node(char data){
            this.data= data;
            this.next= null;
        }
    }
    public static void printLinkedList(Node head){
        if(head==null){
            System.out.println("null");
            return;
        }
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
        return;
    }
    public static void printStack(Stack<Character> s){
        if(s.isEmpty()){
            return;
        }
        char top= s.pop();
        System.out.println(top);
        printStack(s);
        s.push(top);
    }
    // public static void pushAtBottom(Stack<Character> s, char ch){
    //     if(s.isEmpty()){
    //         s.push(ch);
    //         return;
    //     }
    //     char top= s.pop();
    //     pushAtBottom(s, ch);
    //     s.push(top);
    // }
    // public static void reverseStack(Stack<Character> s){
    //     if(s.isEmpty()){
    //         return;
    //     }
    //     char top= s.pop();
    //     reverseStack(s);
    //     pushAtBottom(s, top);
    // }
    // public static Stack<Character> createStack(Node head){
    //     Stack<Character> s= new Stack<>();
    //     Node temp= head;
    //     while(temp!=null){
    //         s.push(temp.data);
    //         temp= temp.next;
    //     }
    //     return s;
    // }
    // public static boolean isPalindromeLinkedList(Node head){
    //     Stack<Character> word= createStack(head);
    //     System.out.println("word stack:-");
    //     printStack(word);
    //     Stack<Character> revword= createStack(head);
    //     reverseStack(revword);
    //     System.out.println("reverse word stack:-");
    //     printStack(word);

    //     while(!word.isEmpty() && !revword.isEmpty()){
    //         if(word.pop()!=revword.pop()){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public static boolean isPalindromeLinkedList(Node head){
        Stack<Character> word= new Stack<>();
        Node temp1= head;
        while(temp1!=null){
            word.push(temp1.data);
            temp1= temp1.next;
        }
        System.out.println("word stack:-");
        printStack(word);
        Node temp=head;
        while(!word.isEmpty()){
            if(word.pop()!=temp.data){
                return false;
            }
            temp= temp.next;
        }
        return true;
    }
    public static void main(String args[]){
        Node head= new Node('N');
        head.next= new Node('A');
        head.next.next= new Node('M');
        head.next.next.next= new Node('A');
        head.next.next.next.next= new Node('N');
        printLinkedList(head);
        boolean isPalindrome= isPalindromeLinkedList(head);
        if(isPalindrome){
            System.out.println("YES It is Palindrome");
        }
        else{
            System.out.println("NO It not Palindrome");
        }
    }
}