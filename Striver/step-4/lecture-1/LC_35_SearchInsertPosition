class Solution {
    public int searchInsert(int[] nums, int target) {
        int si= 0;
        int ei= nums.length-1;
        int lb= nums.length;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(nums[mi]>=target){
                lb= mi;
                ei= mi-1;
            }
            else{
                si= mi+1;
            }
        }
        return lb;
    }
}