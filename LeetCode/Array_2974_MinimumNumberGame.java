import java.util.*;
class Solution {
    public static void merge(int arr[], int si, int mid, int ei){
        int tempArr[]= new int[ei-si+1];
        int i=si;
        int j= mid+1;
        int k= 0;
        while(i<=mid && j<=ei){
            if(arr[i]>arr[j]){
                tempArr[k]= arr[j];
                j++;
                k++;
            }
            else{
                tempArr[k]=arr[i];
                i++;
                k++;
            }
        }
        while(i<=mid){
            tempArr[k]= arr[i];
            i++;
            k++;
        }
        while(j<=ei){
            tempArr[k]= arr[j];
            j++;
            k++;
        }
        for(int l=0; l<tempArr.length; l++){
            arr[si+l]= tempArr[l];
        }
    }
    public static void mergeSort(int arr[], int start, int end){
        int mid= start+(end-start)/2;
        if(start>=end){
            return;
        }
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
    public int[] numberGame(int[] nums) {
        int start=0;
        int end= nums.length-1;
        mergeSort(nums, start, end);
        // Arrays.sort(nums);
        for(int i=0; i<nums.length; i+=2){
            int temp= nums[i];
            nums[i]= nums[i+1];
            nums[i+1]= temp;
        }
        return nums;
    }   
}