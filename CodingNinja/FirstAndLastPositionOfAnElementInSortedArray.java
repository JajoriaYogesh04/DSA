import java.util.*;
public class Solution {
    public static int firstOccurrence(ArrayList<Integer> arr, int n, int k){
        int si= 0;
        int ei= n-1;
        int fo= -1;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(arr.get(mi)==k){
                fo= mi;
                ei= mi-1;
            }
            else if(arr.get(mi)<k){
                si= mi+1;
            }
            else{
                ei= mi-1;
            }
        }
        return fo;
    }
    public static int lastOccurrence(ArrayList<Integer> arr, int n, int k){
        int si= 0;
        int ei= n-1;
        int lo= -1;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(arr.get(mi)==k){
                lo= mi;
                si= mi+1;
            }
            else if(arr.get(mi)<k){
                si= mi+1;
            }
            else{
                ei= mi-1;
            }
        }
        return lo;    
    }
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int first= firstOccurrence(arr, n, k);
        if(first==-1){
            return new int[]{-1,-1};
        }
        int last= lastOccurrence(arr, n, k);
        return new int[]{first, last};
    }

};
