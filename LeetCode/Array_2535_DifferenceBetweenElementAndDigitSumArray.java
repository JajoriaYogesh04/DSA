class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum= 0;
        int digitSum= 0;
        for(int i=0; i<nums.length; i++){
            eleSum+=nums[i];
            while(nums[i]>0){
                int ld= nums[i]%10;
                digitSum+=ld;
                nums[i]/=10;
            }
        }
        return Math.abs(eleSum-digitSum);
    }
}