class Solution {

    static int findFloor(int[] arr, int k) {
        // write code here
        int si= 0;
        int ei= arr.length-1;
        int ans= -1;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(arr[mi]<=k){
                ans= mi;
                si= mi+1;
            }
            else{
                ei=mi-1;
            }
        }
        return ans;
    }
}