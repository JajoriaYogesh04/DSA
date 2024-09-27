class Solution {
    public int leftBound(int nums[], int target){
        int si= 0;
        int ei= nums.length-1;
        int leftBound= -1;
        while(si<=ei){
            int mid= si+(ei-si)/2;
            if(nums[mid]== target){
                leftBound= mid;
                ei= mid-1;
            }
            else if(nums[mid]<target){
                si= mid+1;
            }
            else{
                ei= mid-1;
            }
        }
        return leftBound;
    }
    public int rightBound(int nums[], int target){
        int si= 0;
        int ei= nums.length-1;
        int rightBound= -1;
        while(si<=ei){
            int mid= si+(ei-si)/2;
            if(nums[mid]== target){
                rightBound= mid;
                si= mid+1;
            }
            else if(nums[mid]<target){
                si= mid+1;
            }
            else{
                ei= mid-1;
            }
        }
        return rightBound;
    }
    public int[] searchRange(int[] nums, int target) {
        int arr[]= new int[2];
        arr[0]= leftBound(nums, target);
        arr[1]= rightBound(nums, target);
        return arr;
    }
}