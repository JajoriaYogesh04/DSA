import java.util.* ;
import java.io.*; 
import java.util.Queue;

public class Solution {
    public static void reverse(Queue<Integer> queue, int k){
        // Write your code here.
        int n= queue.size();
        Stack<Integer> s= new Stack<>();
        for(int i=0; i<k; i++){
            s.push(queue.remove());
        }
        while(!s.isEmpty()){
            queue.add(s.pop());
        }
        for(int i=0; i<n-k; i++){
            queue.add(queue.remove());
        }
    }
}