// class Solution {
//     public int maxProfit(int[] prices) {
//         int buyPrice= Integer.MAX_VALUE;
//         int maxProfit= 0;
//         for(int i=0; i<prices.length; i++){
//             if(prices[i]>buyPrice){
//                 int profit= prices[i]- buyPrice;
//                 if(profit>maxProfit){
//                     maxProfit=profit;
//                 }
//             }
//             else{
//                 buyPrice= prices[i];
//             }
//         }
//         return maxProfit;    
//     }
// }



class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice= Integer.MAX_VALUE;
        int maxProfit= 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<buyPrice){
                buyPrice= prices[i];
            }
            if(prices[i]-buyPrice>maxProfit){
                maxProfit= prices[i]-buyPrice;
            }
        }
        return maxProfit;    
    }
}