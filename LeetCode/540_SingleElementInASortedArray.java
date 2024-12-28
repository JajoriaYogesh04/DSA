class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        int si=1;
        int ei=n-2;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(nums[mi-1]!=nums[mi] && nums[mi]!=nums[mi+1]){
                return nums[mi];
            }
            if((mi%2==1 && nums[mi-1]==nums[mi])||(mi%2==0 && nums[mi]==nums[mi+1])){
                si=mi+1;
            }
            else{
                ei=mi-1;
            }
        }
        return -1;
    }
}