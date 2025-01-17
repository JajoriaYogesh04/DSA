public class Solution {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int ans= n;
        int si= 0;
        int ei= n-1;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(arr[mi]>x){
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
