public class BestTimeToBuyAndSellStock{
    public static int bestTimeToBuyAndSellStock(int prices[]){
        int maxprofit= 0;
        int buy= prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i]<buy){
                buy= prices[i];
            }
            else if(prices[i]-buy>maxprofit){
                maxprofit= prices[i]-buy;
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        // Test case 1
        int prices1[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Test Case 1: " + bestTimeToBuyAndSellStock(prices1)); // Expected output: 5

        // Test case 2
        int prices2[] = {7, 6, 4, 3, 1};
        System.out.println("Test Case 2: " + bestTimeToBuyAndSellStock(prices2)); // Expected output: 0

        // Test case 3: Prices are in ascending order
        int prices3[] = {1, 2, 3, 4, 5};
        System.out.println("Test Case 3: " + bestTimeToBuyAndSellStock(prices3)); // Expected output: 4

        // Test case 4: Prices are in descending order
        int prices4[] = {5, 4, 3, 2, 1};
        System.out.println("Test Case 4: " + bestTimeToBuyAndSellStock(prices4)); // Expected output: 0

        // Test case 5: Prices fluctuate
        int prices5[] = {2, 4, 1, 7, 3, 5, 8};
        System.out.println("Test Case 5: " + bestTimeToBuyAndSellStock(prices5)); // Expected output: 7
    }
}