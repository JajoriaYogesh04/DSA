// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int arr[]= new int[2];
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i]+nums[j]==target){
//                     arr[0]= i;
//                     arr[1]= j;
//                     break;
//                 }
//             }
//         }
//         return arr;
//     }
// }


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int more= target-nums[i];
            if(map.containsKey(more)){
                return new int[]{map.get(more), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}