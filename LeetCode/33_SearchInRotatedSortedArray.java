// class Solution {
//     public int searchRotated(int arr[], int target, int si, int ei){
//         if(si>ei){
//             return -1;
//         }
//         int mid= si+(ei-si)/2;
        
//         if(arr[mid]==target){
//             return mid;
//         }
//         if(arr[si]<=arr[mid]){
//             if(arr[si]<=target && target<arr[mid]){
//                 return searchRotated(arr, target, si, mid-1);
//             }
//             else{
//                 return searchRotated(arr, target, mid+1, ei);
//             }
//         }
//         else{
//             if(arr[mid]<target && target<=arr[ei]){
//                 return searchRotated(arr, target, mid+1, ei);
//             }
//             else{
//                 return searchRotated(arr, target, si, mid-1);
//             }
//         }
//     }
//     public int search(int[] nums, int target) {
//         return searchRotated(nums, target, 0, nums.length-1);
//     }
// }



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