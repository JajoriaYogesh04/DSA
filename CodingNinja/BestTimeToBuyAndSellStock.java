import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int buy= Integer.MAX_VALUE;
        int profit= 0;
        for(int i=0; i<prices.size(); i++){
            int rate= prices.get(i);
            if(rate<buy){
                buy= rate;
            }
            if(rate-buy>profit){
                profit= rate-buy;
            }
        }
        return profit; 
    }
}