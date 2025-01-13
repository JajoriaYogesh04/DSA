

class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public int minCost(int[] arr) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        int cost= 0;
        while(pq.size()>1){
            int first= pq.poll();
            int second= pq.poll();
            cost+=first+second;
            pq.add(first+second);
        }
        return cost;
    }
}