
public class Solution {
    public static int lastOccurrence(int arr[], int n, int x){
        int si= 0;
        int ei= n-1;
        int lo= -1;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(arr[mi]==x){
                lo= mi;
                si= mi+1;
            }
            else if(arr[mi]<x){
                si=mi+1;
            }
            else{
                ei= mi-1;
            }
        }
        return lo;
    }
    public static int firstOccurrence(int arr[], int n, int x){
        int si= 0;
        int ei= n-1;
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
    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int first= firstOccurrence(arr, n, x);
        if(first==-1){
            return 0;
        }
        return lastOccurrence(arr, n, x)-first+1;
    }
}