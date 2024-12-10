import java.util.HashMap;

public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int n= a.length;
        HashMap<Integer, Integer> map= new HashMap<>();
        int xor= 0;
        map.put(xor, 1);
        int count= 0;
        for(int i=0; i<a.length; i++){
            xor= xor^a[i];
            int x= xor^b;
            if(map.containsKey(x)){
                count+=map.get(x);
            }
            if(map.containsKey(xor)){
                map.put(xor, map.get(xor)+1);
            }
            else{
                map.put(xor, 1);
            }
        }
        return count;
    }
}