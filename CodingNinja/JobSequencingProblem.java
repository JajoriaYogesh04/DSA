import java.util.*;
public class Solution {
    public static int[] jobScheduling(int [][]jobs) {
        // Write your code here
        Arrays.sort(jobs, (a,b)->a[1]-b[1]);
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0; i<jobs.length; i++){
            if(jobs[i][1]>pq.size()){
                pq.add(jobs[i][2]);
            }
            else if(jobs[i][1]==pq.size()){
                if(jobs[i][2]>pq.peek()){
                    pq.poll();
                    pq.add(jobs[i][2]);
                }
            }
        }
        int sz= pq.size();
        int pro=0;
        while(!pq.isEmpty()){
            pro+=pq.remove();
        }
        return new int[] {sz, pro};
    }
}
