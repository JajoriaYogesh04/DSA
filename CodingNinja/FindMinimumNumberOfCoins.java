import java.util.*;
public class Solution {
    public static List<Integer> MinimumCoins(int n) {
        // Write your code here.
        int coins[]= {1000,500,100,50,20,10,5,2,1};
        List<Integer> list= new ArrayList<>();
        for(int i=0; i<coins.length; i++){
            while(coins[i]<=n){
                list.add(coins[i]);
                n-=coins[i];
            }
        }
        return list;
    }
}
