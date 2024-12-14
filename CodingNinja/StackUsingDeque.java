import java.util.* ;
import java.io.*; 
public class Stack {
	// Initialize your data structure.
	Deque<Integer> deque;
	int size=0;
	Stack() {
		deque= new LinkedList<>();
	}

	// Pushes 'X' into the stack. Returns true if it gets pushed into the stack, and false otherwise.
	public boolean push(int x) {
		// Write your code here.
		deque.addLast(x);
		size++;
		return true;
	}

	// Pops top element from Stack. Returns -1 if the stack is empty, otherwise returns the popped element.
	public int pop() {
		// Write your code here.
		if(isEmpty()){
			return -1;
		}
		size--;
		return deque.removeLast();
	}

	// Returns the topmost element of the stack. In case the stack is empty, it returns -1.
	public int top() {
		// Write your code here.
		if(isEmpty()){
			return -1;
		}
		return deque.getLast();
	}

	// Returns true if the stack is empty, otherwise false.
	public boolean isEmpty() {
		// Write your code here.
		return deque.isEmpty();
	}

	// Returns the number of elements currently present in the stack.
	public int size() {
		// Write your code here.
		return size;
	}
}