import java.util.*;
public class QuickSort {
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pIdx= partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
        partition(arr, si, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int i= si-1;
        int j= si;
        int pivot= arr[ei];
        for(j= si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        i++;
        int temp= pivot;
        arr[ei]= arr[i];
        arr[i]= temp;
        return i;
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
        System.out.print("Enter Length: ");
        int length= sc.nextInt();
        int arr[]= new int[length];
        inputArray(arr);
        int start= 0;
        int end= arr.length-1;
        quickSort(arr, start, end);
        printArray(arr);
    }
}