public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int si= 0;
        int ei= n-1;
        int ans= n;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(arr[mi]>=x){
                ans= mi;
                ei= mi-1;
            }
            else{
                si= mi+1;
            }
        }
        return ans;
    }
}