import java.util.* ;
import java.io.*; 
import java.util.Queue;

public class Solution {
    public static void interLeaveQueue(Queue < Integer > q) {
        // Write your code here.
        int size= q.size();
        Queue<Integer> q2= new LinkedList<>();
        for(int i=0; i<size/2; i++){
            q2.add(q.remove());
        }
        while(!q2.isEmpty()){
            q.add(q2.remove());
            q.add(q.remove());
        }
    }
}