import java.util.*;

public class BuySellStock {

    public static void buySellStock(int arr[]){
        int buyPrice= Integer.MAX_VALUE;
        int maxProfit= 0;
        for(int i=0; i<arr.length; i++){
            if(buyPrice<arr[i]){
                int profit= arr[i]-buyPrice;
                if(profit>maxProfit){
                    maxProfit= profit;
                }
            }
            else{
                buyPrice= arr[i];
            }
        }
        System.out.println("Maximum Profit: "+maxProfit);
    }
    public static void inputArray(int arr[]){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter: ");
            arr[i]= sc.nextInt();
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int length= sc.nextInt();
        int prices[]= new int[length];
        inputArray(prices);
        buySellStock(prices);
    }
}