import java.util.*;
public class Backtracking{
    public static void changeArray(int arr[], int i, int val){
        if(i==arr.length){
            printArray(arr);
            return;
        }
        arr[i]= val;
        changeArray(arr, i+1, val+1);                 //call
        arr[i]= arr[i]-2;                           //backtracking
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length= sc.nextInt();
        int arr[]= new int[length];
        changeArray(arr, 0, 1);
        printArray(arr);
    }
}