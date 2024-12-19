import java.util.*;
public class IndianCoins{
    public static ArrayList<Integer> indianCoins(Integer coins[], int amount){
        ArrayList<Integer> list= new ArrayList<>();
        Arrays.sort(coins, Comparator.reverseOrder());
        for(int i=0; i<coins.length; i++){
            while(coins[i]<=amount){
                list.add(coins[i]);
                amount-=coins[i];
            }
        }
        return list;
    }
    public static void main(String args[]){
        Integer coins[]= {1,2,5,10,20,50,100,500,2000};
        
        // Test case 1
        int amount1 = 590;
        ArrayList<Integer> change1 = indianCoins(coins, amount1);
        System.out.println("Test Case 1:");
        System.out.println("Amount: " + amount1);
        System.out.println("Number of coins: " + change1.size());
        System.out.println("Coins: " + change1);
        System.out.println();

        // Test case 2
        int amount2 = 372;
        ArrayList<Integer> change2 = indianCoins(coins, amount2);
        System.out.println("Test Case 2:");
        System.out.println("Amount: " + amount2);
        System.out.println("Number of coins: " + change2.size());
        System.out.println("Coins: " + change2);
        System.out.println();

        // Test case 3
        int amount3 = 8;
        ArrayList<Integer> change3 = indianCoins(coins, amount3);
        System.out.println("Test Case 3:");
        System.out.println("Amount: " + amount3);
        System.out.println("Number of coins: " + change3.size());
        System.out.println("Coins: " + change3);
        System.out.println();

        // Test case 4
        int amount4 = 0;
        ArrayList<Integer> change4 = indianCoins(coins, amount4);
        System.out.println("Test Case 4:");
        System.out.println("Amount: " + amount4);
        System.out.println("Number of coins: " + change4.size());
        System.out.println("Coins: " + change4);
        System.out.println();

        // Test case 5
        int amount5 = 2000;
        ArrayList<Integer> change5 = indianCoins(coins, amount5);
        System.out.println("Test Case 5:");
        System.out.println("Amount: " + amount5);
        System.out.println("Number of coins: " + change5.size());
        System.out.println("Coins: " + change5);
        System.out.println();
    }
}