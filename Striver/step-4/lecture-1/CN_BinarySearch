public class Solution {
    public static int search(int []arr, int target) {
        // Write your code here.
        int start= 0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target<arr[mid]){
                end= mid-1;
            }
            else{
                start= mid+1;
            }
        }
        return -1;
    }
}