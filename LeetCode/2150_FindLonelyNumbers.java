class Solution {
    public List<Integer> findLonely(int[] list) {
        ArrayList<Integer> result= new ArrayList<>();
        int n= list.length;
        if(n==1){
            result.add(list[0]);
            return result;
        }
        Arrays.sort(list);
        if(list[0]+1!=list[1] && list[0]!=list[1]){
            result.add(list[0]);
        }
        if(list[n-1]-1!=list[n-2] && list[n-1]!=list[n-2]){
            result.add(list[n-1]);
        }
        for(int i=1; i<=n-2; i++){
            int curr= list[i];
            if(curr-1!=list[i-1] && curr+1!=list[i+1] && curr!=list[i-1] && curr!=list[i+1]){
                result.add(curr);
            }
        }
        return result;
    }
}