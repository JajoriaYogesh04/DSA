import java.util.*;
public class StockSpan {
    public static int[] stockSpan(int stock[]){
        int span[]= new int[stock.length];
        Stack<Integer> s= new Stack<>();
        span[0]= 1;
        s.push(0);
        for(int i=1; i<span.length; i++){
            while(!s.isEmpty() && stock[i]>=stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]= i+1;
            }
            else{
                int prevHigh= s.peek();
                span[i]= i-prevHigh;
            }
            s.push(i);
        }
        return span;
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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
        System.out.print("Enter Length: ");
        int n= sc.nextInt();
        int stock[]= new int[n]; 
        inputArray(stock);       
        // int stock[]= {100,80,60,70,60,85,100};
        printArray(stockSpan(stock));
    }
}