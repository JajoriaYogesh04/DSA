class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq= new ArrayDeque<>();
        int result[]= new int[nums.length-k+1];
        for(int i=0; i<nums.length; i++){
            while(!dq.isEmpty() && nums[i]>nums[dq.peekLast()]){
                dq.removeLast();
            }
            while(!dq.isEmpty() && dq.peekFirst()<i-k+1){
                dq.removeFirst();
            }
            dq.add(i);
            if(i>=k-1){
                result[i-k+1]= nums[dq.peekFirst()];
            }
        }
        return result;
    }
}