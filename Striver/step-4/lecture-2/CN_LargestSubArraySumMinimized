
public class Solution {
    public static int subarraycount(int arr[], int total){
        int count=1;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]+sum<=total){
                sum+=arr[i];
            }
            else{
                sum=arr[i];
                count++;
            }
        }
        return count;
    }
    public static int largestSubarraySumMinimized(int []a, int k) {
        // Write Your Code Here
        int low= Integer.MIN_VALUE;
        int high=0;
        for(int i=0; i<a.length; i++){
            low= Math.max(low, a[i]);
            high+=a[i];
        }
        while(low<=high){
            int mid= low+(high-low)/2;
            if(subarraycount(a,mid)>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}



