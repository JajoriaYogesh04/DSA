import java.util.*;
public class Solution {
    public static long getTrappedWater(long []arr, int n) {
        // Write your code here.
        Stack<Integer> s= new Stack<>();
        long vol=0;
        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[i]>arr[s.peek()]){
                long popheight= arr[s.pop()];
                if(s.isEmpty()){
                    break;
                }
                int dist= i-s.peek()-1;
                long level= Math.min(arr[i], arr[s.peek()])-popheight;
                vol+=level*dist;
            }
            s.push(i);
        }
        return vol;
    }
}