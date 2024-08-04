import java.util.*;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0; i<=arr.length-2; i++){
            int minPosition= i;
            for(int j=i+1; j<=arr.length-1; j++){
                if(arr[j]<arr[minPosition]){
                    minPosition= j;
                }
            }
            int temp= arr[i];
            arr[i]= arr[minPosition];
            arr[minPosition]= temp;
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
        selectionSort(arr);
        printArray(arr);
    }
}






















