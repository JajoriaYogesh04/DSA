class Solution {
    public int findMin(int[] nums) {
        int si=0;
        int ei=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(nums[si]<=nums[ei]){
                min=Math.min(min,nums[si]);
                break;
            }
            if(nums[si]<=nums[mi]){
                min=Math.min(min,nums[si]);
                si=mi+1;
            }
            else{
                min=Math.min(min,nums[mi]);
                ei=mi-1;
            }
        }
        return min;
    }
}