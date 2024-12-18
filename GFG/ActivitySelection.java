


class Solution {
    public int activitySelection(List<Integer> start, List<Integer> end) {
        // code here.
        int activities[][]= new int[start.size()][3];
        for(int i=0; i<start.size(); i++){
            activities[i][0]= i;
            activities[i][1]= start.get(i);
            activities[i][2]= end.get(i);
        }
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));
        int count=1;
        int lastEnd= activities[0][2];
        for(int i=1; i<activities.length; i++){
            if(activities[i][1]>lastEnd){
                count++;
                lastEnd= activities[i][2];
            }
        }
        return count;
    }
}