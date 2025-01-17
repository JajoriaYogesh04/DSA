class Solution {
    public static int firstOccurrence(int arr[], int target){
        int si= 0;
        int ei= arr.length-1;
        int fo= -1;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(arr[mi]==target){
                fo= mi;
                ei= mi-1;
            }
            else if(arr[mi]<target){
                si= mi+1;
            }
            else{
                ei= mi-1;
            }
        }
        return fo;
    }
    public static int lastOccurrence(int arr[], int target){
        int si= 0;
        int ei= arr.length-1;
        int lo= -1;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(arr[mi]==target){
                lo= mi;
                si= mi+1;
            }
            else if(arr[mi]>target){
                ei= mi-1;
            }
            else{
                si= mi+1;
            }
        }
        return lo;
    }
    public int[] searchRange(int[] nums, int target) {
        int first= firstOccurrence(nums, target);
        if(first==-1){
            return new int[]{-1,-1};
        }
        int last= lastOccurrence(nums, target);
        return new int[]{first,last};
    }
}