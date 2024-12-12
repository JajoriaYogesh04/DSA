import java.util.*;
public class Solution {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        // Write your code here.
        int n= a.length;
        int m= b.length;
        int left= n-1;
        int right= 0;
        while(left>=0 && right<=m){
            if(a[left]>b[right]){
                long temp= a[left];
                a[left]= b[right];
                b[right]= temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}