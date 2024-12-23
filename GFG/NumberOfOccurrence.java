

class Solution {
    int firstOccurrence(int arr[], int target){
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
    int lastOccurrence(int arr[], int target){
        int si=0;
        int ei=arr.length-1;
        int lo= 0;
        while(si<=ei){
            int mi=si+(ei-si)/2;
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
    int countFreq(int[] arr, int target) {
        // code here
        int first= firstOccurrence(arr, target);
        if(first==-1){
            return 0;
        }
        return lastOccurrence(arr, target)-first+1;
    }
}