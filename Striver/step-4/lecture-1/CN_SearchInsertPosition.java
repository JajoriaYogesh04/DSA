public class Solution {
    public static int searchInsert(int [] arr, int m){
        // Write your code here.
        int si= 0;
        int ei= arr.length-1;
        int lb= arr.length;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(arr[mi]>=m){
                lb= mi;
                ei= mi-1;
            }
            else{
                si= mi+1;
            }
        }
        return lb;
    }
}