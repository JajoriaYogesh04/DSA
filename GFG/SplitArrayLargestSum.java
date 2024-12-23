

class Solution {
    static int subarrayCount(int arr[], int total){
        int count= 1;
        int sum= 0;
        for(int i=0; i<arr.length; i++){
            if(sum+arr[i]<=total){
                sum+=arr[i];
            }
            else{
                count++;
                sum=arr[i];
            }
        }
        return count;
    }
    static int splitArray(int[] arr , int N, int K) {
        // code here
        int low= Integer.MIN_VALUE;
        int high= 0;
        for(int i=0; i<arr.length; i++){
            low= Math.max(low, arr[i]);
            high+=arr[i];
        }
        while(low<=high){
            int mid= low+(high-low)/2;
            if(subarrayCount(arr,mid)>K){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
};