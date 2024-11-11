class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
        if(arr.size()<2){
            return 0;
        }
        int max= Integer.MIN_VALUE;
        for(int i=0; i<arr.size()-1; i++){
            int sum= arr.get(i)+arr.get(i+1);
            if(sum>max){
                max= sum;
            }
        }
        return max;
    }
}