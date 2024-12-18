import java.util.*;
public class ActivitySelection{
    public static void activitySelection(int start[], int end[]){
        int activities[][]= new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0]= i;
            activities[i][1]= start[i];
            activities[i][2]= end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));
        ArrayList<Integer> list= new ArrayList<>();
        list.add(activities[0][0]);
        int lastEnd= activities[0][2];
        for(int i=1; i<activities.length; i++){
            if(activities[i][1]>=lastEnd){
                list.add(activities[i][0]);
                lastEnd= activities[i][2];
            }
        }
        System.out.println("Maximum Activities: "+list.size());
        for(int i=0; i<list.size(); i++){
            System.out.print("A"+list.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // int start[]= {1,3,0,5,8,5};
        // int end[]= {2,4,6,7,9,9};
        // activitySelection(start, end);

        // Test case 1: Provided example
        int start1[] = {1, 3, 0, 5, 8, 5};
        int end1[] = {2, 4, 6, 7, 9, 9};
        System.out.println("Test Case 1:");
        activitySelection(start1, end1);

        // Test case 2: Overlapping activities
        int start2[] = {1, 2, 3, 4};
        int end2[] = {2, 3, 4, 5};
        System.out.println("Test Case 2:");
        activitySelection(start2, end2);

        // Test case 3: All activities overlap
        int start3[] = {1, 1, 1, 1};
        int end3[] = {10, 10, 10, 10};
        System.out.println("Test Case 3:");
        activitySelection(start3, end3);

        // Test case 4: Non-overlapping activities
        int start4[] = {1, 2, 3, 4};
        int end4[] = {2, 3, 4, 5};
        System.out.println("Test Case 4:");
        activitySelection(start4, end4);

        // Test case 5: Single activity
        int start5[] = {0};
        int end5[] = {1};
        System.out.println("Test Case 5:");
        activitySelection(start5, end5);

        // Test case 6: Large gap between activities
        int start6[] = {1, 10, 20, 30};
        int end6[] = {5, 15, 25, 35};
        System.out.println("Test Case 6:");
        activitySelection(start6, end6);
    }
}