import java.util.*;
public class NextGreaterElement {
    public static int[] nextGreaterElement(int arr[]){
        int n= arr.length;
        int nextgreater[]= new int[n];
        Stack<Integer> s= new Stack<>();
        for(int i= n-1; i>=0; i--){
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextgreater[i]= -1;
            }
            else{
                nextgreater[i]= arr[s.peek()];
            }
            s.push(i);
        }
        return nextgreater;
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
        int arr[]= new int[n];
        inputArray(arr);
        // int arr[]= {4,5,2,25,7,8,6,3};
        printArray(nextGreaterElement(arr));
    }
}