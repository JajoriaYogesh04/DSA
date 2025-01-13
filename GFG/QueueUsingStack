

class Queue
{
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	    // Your code here
	    if(input.isEmpty() && output.isEmpty()){
	        return -1;
	    }
	    return input.pop();
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    // Your code here
	    while(!input.isEmpty()){
	        output.push(input.pop());
	    }
	    input.push(x);
	    while(!output.isEmpty()){
	        input.push(output.pop());
	    }
    }
}