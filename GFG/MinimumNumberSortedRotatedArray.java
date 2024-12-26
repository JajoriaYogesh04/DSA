

class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        // Your code here
        int min=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[low]<=arr[high]){
                min=Math.min(min,arr[low]);
                break;
            }
            if(arr[low]<=arr[mid]){
                min=Math.min(min,arr[low]);
                low=mid+1;
            }
            else{
                min=Math.min(min,arr[mid]);
                high=mid-1;
            }
        }
        return min;
    }
}