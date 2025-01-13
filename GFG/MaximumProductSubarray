

class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int max= Integer.MIN_VALUE;
        int pre= 1;
        int suf= 1;
        int n= arr.length;
        for(int i=0; i<n; i++){
            if(pre==0){
                pre= 1;
            }
            if(suf==0){
                suf= 1;
            }
            pre*=arr[i];
            suf*=arr[n-1-i];
            max= Math.max(max, Math.max(pre, suf));
        }
        return max;
    }
}