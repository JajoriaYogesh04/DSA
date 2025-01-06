class Solution {
    public static boolean isPossible(int nums[], int div, int limit){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/div);
        }
        return sum<=limit;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int ei=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            ei=Math.max(nums[i],ei);
        }
        int si=1;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(isPossible(nums,mi,threshold)){
                ei=mi-1;
            }
            else{
                si=mi+1;
            }
        }
        return si;
    }
}