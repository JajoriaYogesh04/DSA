public class Solution {
    public static int firstOccurrence(int arr[], int x){
        int si= 0;
        int ei= arr.length-1;
        int fo= -1;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(arr[mi]==x){
                fo= mi;
                ei= mi-1;
            }
            else if(arr[mi]<x){
                si= mi+1;    
            }
            else{
                ei= mi-1;
            }
        }
        return fo;
    }
    public static int lastOccurrence(int arr[], int x){
        int si= 0;
        int ei= arr.length-1;
        int lo= -1;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(arr[mi]==x){
                lo= mi;
                si= mi+1; 
            }
            else if(arr[mi]>x){
                ei= mi-1;
            }
            else{
                si= mi+1;
            }
        }
        return lo;
    }
    public static int[] searchRange(int []arr, int x) {
        // Write your code here.
        int first= firstOccurrence(arr, x);
        if(first==-1){
            return new int[]{-1,-1};
        }
        int last= lastOccurrence(arr, x);
        return new int[]{first, last};
    }
}