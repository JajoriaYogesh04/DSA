import java.util.*;
public class Solution {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        HashMap<Integer, Integer> map= new HashMap<>();
        int sum= 0;
        int maxl= 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum==0){
                maxl= i+1;
            }
            else{
                if(map.get(sum)!=null){
                    maxl= Math.max(maxl, i-map.get(sum));
                }
                else{
                    map.put(sum, i);
                }
            }
        }
        return maxl;
    }
}