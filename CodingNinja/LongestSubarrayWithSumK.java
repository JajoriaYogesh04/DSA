public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int max= 0;
        for(int i=0; i<a.length; i++){
            long sum= 0;
            int len= 0;
            for(int j=i;j<a.length; j++){
                sum+=a[j];
                len= j-i+1; 
                if(sum==k){
                    if(len>max){
                        max= len;
                    }
                } 
            }
        }
        return max;
    }
}