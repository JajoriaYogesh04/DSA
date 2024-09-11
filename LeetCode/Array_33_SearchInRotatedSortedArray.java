class Solution {
    public int searchRotated(int arr[], int target, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid= si+(ei-si)/2;
        
        if(arr[mid]==target){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=target && target<arr[mid]){
                return searchRotated(arr, target, si, mid-1);
            }
            else{
                return searchRotated(arr, target, mid+1, ei);
            }
        }
        else{
            if(arr[mid]<target && target<=arr[ei]){
                return searchRotated(arr, target, mid+1, ei);
            }
            else{
                return searchRotated(arr, target, si, mid-1);
            }
        }
    }
    public int search(int[] nums, int target) {
        return searchRotated(nums, target, 0, nums.length-1);
    }
}