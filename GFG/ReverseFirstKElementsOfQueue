

// User function Template for Java

class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        int n= q.size();
        Stack<Integer> s= new Stack<>();
        for(int i=0; i<k; i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i=0; i<n-k; i++){
            q.add(q.remove());
        }
        return q;
    }
}