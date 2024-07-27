import java.util.*;

public class ReverseArray{
    public static void reverseArray(int arr[]){
        int start= 0;
        int end= arr.length-1;
        while(start<end){
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]+" ");
        }
        System.out.println();
    }
    public static void inputArray(int arr[], int length){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<length; i++){
            System.out.print("Enter: ");
            arr[i]= sc.nextInt();
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int length= sc.nextInt();
        int arr[]= new int [length];
        inputArray(arr, length);
        printArray(arr);
        reverseArray(arr);
        printArray(arr);
    }
}