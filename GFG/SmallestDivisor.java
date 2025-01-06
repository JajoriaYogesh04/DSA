

// User function Template for Java

class Solution {
    boolean isPossible(int arr[], int div, int k){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/div);
        }
        return sum<=k;
    }
    int smallestDivisor(int[] arr, int k) {
        // code here
        int ei=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            ei=Math.max(arr[i],ei);
        }
        int si=1;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(isPossible(arr,mi,k)){
                ei=mi-1;
            }
            else{
                si=mi+1;
            }
        }
        return si;
    }
}