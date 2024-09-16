class Solution {
    public int searchInsert(int[] nums, int target) {
        int si= 0;
        int ei= nums.length-1;
        while(si<=ei){
            int mid= si+(ei-si)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                ei= mid-1;
            }
            else if(target>nums[mid]){
                si= mid+1;
            }
        }
        return si;
    }
}