import java.util.*;

public class PracticeQuestion3 {
    public static int maxProfit(int arr[]){
        int buyingPrice= Integer.MAX_VALUE;
        int profit= 0;
        int maxProfit=0;
        for(int i=0; i<arr.length; i++){
            if(buyingPrice<arr[i]){
                profit= arr[i]-buyingPrice;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
            else{
                buyingPrice= arr[i];
            }
        }
        return maxProfit;
    }
    public static void inputArray(int arr[]){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter: ");
            arr[i]=sc.nextInt();
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int length= sc.nextInt();
        int prices[]= new int[length];
        inputArray(prices);
        int profit= maxProfit(prices);
        System.out.print("Maximum Profit: "+profit);
    }
}