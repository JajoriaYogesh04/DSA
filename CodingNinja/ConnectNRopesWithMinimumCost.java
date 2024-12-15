import java.util.*;
public class Solution 
{
    public static long connectRopes(int[] arr)
    {
        //Write your code here
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        long cost= 0;
        while(pq.size()>1){
            int first= pq.poll();
            int second= pq.poll();
            cost+=first+second;
            pq.add(first+second);
        }
        return cost;
    }
}