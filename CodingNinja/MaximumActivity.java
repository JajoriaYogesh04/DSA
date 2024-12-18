import java.util.*;
public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
        //Write your code here
        int activity[][]= new int[start.size()][2];
        for(int i=0; i<start.size(); i++){
            activity[i][0]= start.get(i);
            activity[i][1]= end.get(i);
        }
        Arrays.sort(activity, Comparator.comparingDouble(o->o[1]));
        int count= 1;
        int lastEnd= activity[0][1];
        for(int i=1; i<activity.length; i++){
            if(activity[i][0]>=lastEnd){
                count++;
                lastEnd= activity[i][1];
            }
        }
        return count;
    }
}