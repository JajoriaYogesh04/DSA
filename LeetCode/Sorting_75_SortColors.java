class Solution {
    public int partition(int arr[], int si, int ei){
        int pivot= arr[ei];
        int i= si-1;
        int j= si;
        for(j=si; j<ei; j++){
            if(arr[j]<pivot){
                i++;
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        i++;
        int temp= arr[i];
        arr[i]= pivot;
        arr[ei]= temp;
        return i;
    }
    public void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pIdx= partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }
    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length-1);
    }
}