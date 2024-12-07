import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Write your code here!
		Stack<Integer> s= new Stack<>();
		LinkedListNode<Integer> temp= head;
		while(temp!=null){
			s.push(temp.data);
			temp= temp.next;
		}
		LinkedListNode<Integer> ch= head;
		while(ch!=null){
			if(!s.pop().equals(ch.data)){
				return false;
			}
			ch= ch.next;
		}
		return true;
	}
}