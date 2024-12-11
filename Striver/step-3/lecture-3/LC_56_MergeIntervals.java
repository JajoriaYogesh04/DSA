class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int a[], int b[]){
                return Integer.compare(a[0], b[0]);
            }
        });
        int n= intervals.length;
        ArrayList<ArrayList<Integer>> merged= new ArrayList<>();
        int idx= 0;
        for(int i=0; i<n; i++){
            int start= intervals[i][0];
            int end= intervals[i][1];
            if(!merged.isEmpty() && end<=merged.get(merged.size()-1).get(1)){
                continue;
            }
            for(int j=i+1; j<n; j++){
                if(end>=intervals[j][0]){
                    end= Math.max(end, intervals[j][1]);
                }
                else{
                    break;
                }
            }
            ArrayList<Integer> el= new ArrayList<>();
            el.add(start);
            el.add(end);
            merged.add(el);
        }
        int result[][]= new int[merged.size()][2];
        for(int i=0; i<merged.size(); i++){
            result[i][0]= merged.get(i).get(0);
            result[i][1]= merged.get(i).get(1);
        }
        return result;
    }
}