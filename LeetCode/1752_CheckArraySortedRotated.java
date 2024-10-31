class Solution {
    public boolean check(int[] nums) {
        int br= 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                br++;
            }
        }
        return br<=1;
    }
}