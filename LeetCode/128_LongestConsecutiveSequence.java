class Solution {
    public int longestConsecutive(int[] nums) {
        int count= 0;
        int longest= 0;
        int lastSmall= Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]-1==lastSmall){
                count++;
                lastSmall= nums[i];
            }
            else if(nums[i]!=lastSmall){
                count= 1;
                lastSmall= nums[i];
            }
            longest= Math.max(count, longest);
        }
        return longest;
    }
}