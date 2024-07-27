import java.util.*;

public class ArrayFunctions {
    public static void inputArray(int arr[]){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter number: ");
            arr[i]= sc.nextInt();
        }
    }

    public static void updateArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i]+=1;
        }
    }

    public static void outputArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n= sc.nextInt();
        int arr[]= new int [n];
        inputArray(arr);
        outputArray(arr);
        updateArray(arr);
        outputArray(arr);
    }
}