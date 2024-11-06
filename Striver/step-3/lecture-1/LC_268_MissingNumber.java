class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int sum= 0;
        int sumNums= 0;
        for(int i=1; i<=n; i++){
            sum+=i;
            sumNums+=nums[i-1];
        }
        return sum-sumNums;
    }
}