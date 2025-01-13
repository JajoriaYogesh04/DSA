

// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int si=0;
        int ei=arr.length-1;
        int min=Integer.MAX_VALUE;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(arr[si]<=arr[ei]){
                min=Math.min(min,arr[si]);
                break;
            }
            if(arr[si]<=arr[mi]){
                min=Math.min(min,arr[si]);
                si=mi+1;
            }
            else{
                min=Math.min(min,arr[mi]);
                ei=mi-1;
            }
        }
        return min;
    }
}