import java.util.*;
public class ConnectNRopesWithMinimumCost{
    public static int connectNRopesWithMinimumCost(int arr[]){
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
    public static void main(String args[]){
        // int arr[]= {4, 3, 2, 6};
        // int minCost= connectNRopesWithMinimumCost(arr);
        // System.out.println(minCost);
         // Define test cases
        int[][] testCases = {
            {4, 3, 2, 6},       // Example 1: Expected output 29
            {1, 2, 3},          // Example 2: Expected output 9
            {8, 4, 6, 12},      // Example 3: Expected output 58
            {20, 4, 8, 2},      // Example 4: Expected output 54
            {1, 2, 5, 10, 35, 89}, // Example 5: Expected output 224
            {10, 10, 10},       // Example 6: Expected output 50
            {1}                 // Example 7: Expected output 0 (only one rope, no cost)
        };
        
        // Run each test case
        for (int i = 0; i < testCases.length; i++) {
            int[] ropes = testCases[i];
            int minCost = connectNRopesWithMinimumCost(ropes);
            System.out.println("Test Case " + (i + 1) + ": " + Arrays.toString(ropes) + " -> Minimum Cost: " + minCost);
        }
    }
}