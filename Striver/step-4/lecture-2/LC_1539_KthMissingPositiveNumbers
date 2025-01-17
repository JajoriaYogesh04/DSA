class Solution {
    public int findKthPositive(int[] arr, int k) {
        if(k<arr[0]){
            return k;
        }
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            int miss=arr[mi]-(mi+1);
            if(miss<k){
                si=mi+1;
            }
            else{
                ei=mi-1;
            }
        }
        return ei+k+1;
    }
}