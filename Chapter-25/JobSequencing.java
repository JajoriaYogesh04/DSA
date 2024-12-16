import java.util.*;
public class JobSequencing{
    public static class Jobs{
        char jobid;
        int deadline;
        int profit;
        public Jobs(char jobid, int deadline, int profit){
            this.jobid= jobid;
            this.deadline= deadline;
            this.profit= profit;
        }
    }
    public static ArrayList<Character> jobSequencing(ArrayList<Jobs> arr){
        int n= arr.size();
        if(n==0){
            return new ArrayList<>();
        }
        Collections.sort(arr, (a,b)->{
            return a.deadline-b.deadline;
        });
        PriorityQueue<Jobs> pq= new PriorityQueue<>((a,b)->a.profit-b.profit);
        for(int i=0; i<n; i++){
            if(arr.get(i).profit==0){
                continue;
            }
            if(arr.get(i).deadline>pq.size()){
                pq.add(arr.get(i));
            }
            else if(arr.get(i).deadline==pq.size()){
                if(arr.get(i).profit>pq.peek().profit){
                    pq.poll();
                    pq.add(arr.get(i));
                }
            }
        }
        ArrayList<Character> result= new ArrayList<>();
        while(!pq.isEmpty()){
            result.add(pq.remove().jobid);
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String args[]){
        // Test Case 1: Example Case
        ArrayList<Jobs> arr1 = new ArrayList<>();
        arr1.add(new Jobs('a', 4, 20));
        arr1.add(new Jobs('b', 1, 10));
        arr1.add(new Jobs('c', 1, 40));
        arr1.add(new Jobs('d', 1, 30));
        System.out.println("Test Case 1:");
        System.out.println("Jobs Scheduled: " + jobSequencing(arr1)); // Expected: [c, a]

        // Test Case 2: All jobs with the same deadline
        ArrayList<Jobs> arr2 = new ArrayList<>();
        arr2.add(new Jobs('e', 2, 50));
        arr2.add(new Jobs('f', 2, 60));
        arr2.add(new Jobs('g', 2, 20));
        arr2.add(new Jobs('h', 2, 30));
        System.out.println("\nTest Case 2:");
        System.out.println("Jobs Scheduled: " + jobSequencing(arr2)); // Expected: [f, e]

        // Test Case 3: Increasing deadlines and profits
        ArrayList<Jobs> arr3 = new ArrayList<>();
        arr3.add(new Jobs('i', 1, 5));
        arr3.add(new Jobs('j', 2, 15));
        arr3.add(new Jobs('k', 3, 25));
        arr3.add(new Jobs('l', 4, 35));
        System.out.println("\nTest Case 3:");
        System.out.println("Jobs Scheduled: " + jobSequencing(arr3)); // Expected: [l, k, j, i]

        // Test Case 4: Empty list of jobs
        ArrayList<Jobs> arr4 = new ArrayList<>();
        System.out.println("\nTest Case 4:");
        System.out.println("Jobs Scheduled: " + jobSequencing(arr4)); // Expected: []

        // Test Case 5: Jobs with deadlines exceeding the number of jobs
        ArrayList<Jobs> arr5 = new ArrayList<>();
        arr5.add(new Jobs('m', 5, 50));
        arr5.add(new Jobs('n', 5, 10));
        arr5.add(new Jobs('o', 5, 20));
        arr5.add(new Jobs('p', 5, 40));
        System.out.println("\nTest Case 5:");
        System.out.println("Jobs Scheduled: " + jobSequencing(arr5)); // Expected: [m, p, o, n]

        // Test Case 6: Jobs with zero profit
        ArrayList<Jobs> arr6 = new ArrayList<>();
        arr6.add(new Jobs('q', 2, 0));
        arr6.add(new Jobs('r', 1, 0));
        arr6.add(new Jobs('s', 2, 0));
        arr6.add(new Jobs('t', 1, 0));
        System.out.println("\nTest Case 6:");
        System.out.println("Jobs Scheduled: " + jobSequencing(arr6)); // Expected: []

        // Test Case 7: Jobs with varying profits but equal deadlines
        ArrayList<Jobs> arr7 = new ArrayList<>();
        arr7.add(new Jobs('u', 3, 10));
        arr7.add(new Jobs('v', 3, 20));
        arr7.add(new Jobs('w', 3, 30));
        arr7.add(new Jobs('x', 3, 40));
        System.out.println("\nTest Case 7:");
        System.out.println("Jobs Scheduled: " + jobSequencing(arr7)); // Expected: [x, w, v]
    }
}