class Solution {
    public int search(int[] nums, int target) {
        int si=0;
        int ei= nums.length-1;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(nums[mi]==target){
                return mi;
            }
            else if(nums[si]<=nums[mi]){
                if(nums[si]<=target && target<nums[mi]){
                    ei=mi-1;
                }
                else{
                    si=mi+1;
                }
            }
            else{
                if(nums[mi]<target && target<=nums[ei]){
                    si=mi+1;
                }
                else{
                    ei=mi-1;
                }
            }
        }
        return -1;
    }
}