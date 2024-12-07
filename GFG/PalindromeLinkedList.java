

/* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        Stack<Integer> s= new Stack<>();
        Node temp= head;
        while(temp!=null){
            s.push(temp.data);
            temp= temp.next;
        }
        Node ch= head;
        while(ch!=null){
            if(s.pop()!=ch.data){
                return false;
            }
            ch= ch.next;
        }
        return true;
    }
}