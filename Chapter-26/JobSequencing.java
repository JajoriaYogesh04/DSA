import java.util.*;
public class JobSequencing{
    public static class Jobs{
        int id;
        int deadline;
        int profit;
        public Jobs(int id, int deadline, int profit){
            this.id= id;
            this.deadline= deadline;
            this.profit= profit;
        }
    }
    public static void jobSequencing(int jobinfo[][]){
        ArrayList<Jobs> jobs= new ArrayList<>();
        for(int i=0; i<jobinfo.length; i++){
            jobs.add(new Jobs(i, jobinfo[i][0], jobinfo[i][1]));
        }
        Collections.sort(jobs, (obj1, obj2)->obj2.profit-obj1.profit);
        ArrayList<Integer> seq= new ArrayList<>();
        int time= 0;
        int maxProfit= 0;
        for(int i=0; i<jobs.size(); i++){
            if(jobs.get(i).deadline>time){
                seq.add(jobs.get(i).id);
                maxProfit+=jobs.get(i).profit;
                time++;
            }
        }
        System.out.println("Number of jobs: " + seq.size());
        System.out.println("Job sequence: " + seq);
        System.out.println("Maximum profit: " + maxProfit);
    }
    public static void main(String args[]){
        // int jobinfo[][]={{4,20}, {1,10},{1,40},{1,30}};
        // jobSequencing(jobinfo);
         // Test Case 1: Given example
        System.out.println("Test Case 1:");
        int jobinfo1[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        jobSequencing(jobinfo1);

        // Test Case 2: All jobs with the same deadline
        System.out.println("\nTest Case 2:");
        int jobinfo2[][] = { { 1, 50 }, { 1, 60 }, { 1, 20 }, { 1, 30 } };
        jobSequencing(jobinfo2);

        // Test Case 3: Jobs with varying deadlines
        System.out.println("\nTest Case 3:");
        int jobinfo3[][] = { { 2, 100 }, { 1, 19 }, { 2, 27 }, { 1, 25 }, { 3, 15 } };
        jobSequencing(jobinfo3);

        // Test Case 4: Jobs with zero or negative profits
        System.out.println("\nTest Case 4:");
        int jobinfo4[][] = { { 2, 0 }, { 1, -10 }, { 3, 20 }, { 1, -30 }, { 4, 10 } };
        jobSequencing(jobinfo4);

        // Test Case 5: Jobs with large deadlines and profits
        System.out.println("\nTest Case 5:");
        int jobinfo5[][] = { { 10, 200 }, { 5, 180 }, { 3, 120 }, { 7, 100 }, { 4, 90 } };
        jobSequencing(jobinfo5);

        // Test Case 6: No jobs
        System.out.println("\nTest Case 6:");
        int jobinfo6[][] = {};
        jobSequencing(jobinfo6);
    }
}