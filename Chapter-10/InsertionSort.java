import java.util.*;
public class InsertionSort{
    public static void insertionSort(int arr[]){
        for(int i=1; i<=arr.length-1; i++){
            int curr= arr[i];
            int prev= i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]= arr[prev];
                prev--;
            }
            arr[prev+1]= curr;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
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
        int arr[]= new int [length];
        inputArray(arr);
        insertionSort(arr);;
        printArray(arr);
    }
}