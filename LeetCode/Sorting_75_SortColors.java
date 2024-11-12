// class Solution {
//     public int partition(int arr[], int si, int ei){
//         int pivot= arr[ei];
//         int i= si-1;
//         int j= si;
//         for(j=si; j<ei; j++){
//             if(arr[j]<pivot){
//                 i++;
//                 int temp= arr[i];
//                 arr[i]= arr[j];
//                 arr[j]= temp;
//             }
//         }
//         i++;
//         int temp= arr[i];
//         arr[i]= pivot;
//         arr[ei]= temp;
//         return i;
//     }
//     public void quickSort(int arr[], int si, int ei){
//         if(si>=ei){
//             return;
//         }
//         int pIdx= partition(arr, si, ei);
//         quickSort(arr, si, pIdx-1);
//         quickSort(arr, pIdx+1, ei);
//     }
//     public void sortColors(int[] nums) {
//         quickSort(nums, 0, nums.length-1);
//     }
// }



class Solution {
    public void swap(int arr[], int i, int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public void sortColors(int[] nums) {
        int low= 0;
        int mid= 0;
        int high= nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            }   
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
}