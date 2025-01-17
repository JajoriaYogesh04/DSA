

// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int si=0;
        int ei=arr.size()-1;
        int min=Integer.MAX_VALUE;
        int idx=-1;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(arr.get(si)<=arr.get(ei)){
                if(arr.get(si)<min){
                    min=arr.get(si);
                    idx=si;
                }
                break;
            }
            if(arr.get(si)<=arr.get(mi)){
                if(arr.get(si)<min){
                    min=arr.get(si);
                    idx=si;
                }
                si=mi+1;
            }
            else{
                if(arr.get(mi)<min){
                    min=arr.get(mi);
                    idx=mi;
                }
                ei=mi-1;
            }
        }
        return idx;
    }
}