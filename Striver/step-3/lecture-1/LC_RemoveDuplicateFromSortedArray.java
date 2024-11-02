class Solution {
    public int removeDuplicates(int[] nums) {
        int count= 1;
        if(nums.length==1){
            return count;
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                nums[count]= nums[i];
                count++;
            }
        }
        return count;
    }
}