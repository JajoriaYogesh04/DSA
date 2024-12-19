import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minimumSum(int[] arr1, int[] arr2, int n) {
        // Write your code here.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int minsum= 0;
        for(int i=0; i<arr1.length; i++){
            minsum+=Math.abs(arr1[i]-arr2[i]);
        }
        return minsum;
    }
}
