import java.util.*;
public class StackSpan {
    public static int[] stockSpan(int stock[], int span[]){
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
    public static void main(String args[]){
        int stock[]= {100,80,60,70,60,85,100};
        int span[]= new int[stock.length];
        printArray(stockSpan(stock, span));
    }
}