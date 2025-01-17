class Solution {
    public int subarraycount(int arr[], int total){
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
    public int splitArray(int[] nums, int k) {
        int low= Integer.MIN_VALUE;
        int high= 0;
        for(int i=0; i<nums.length; i++){
            low=Math.max(low, nums[i]);
            high+=nums[i];
        }
        while(low<=high){
            int mid= low+(high-low)/2;
            if(subarraycount(nums, mid)>k){
                low=mid+1;
            }
            else{
                high= mid-1;
            }
        }
        return low;
    }
}