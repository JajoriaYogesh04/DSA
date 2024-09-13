import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int swap= 0;
        boolean swapped= false;
        for(int i=0; i<=arr.length-2; i++){
            for(int j=0; j<=arr.length-2-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]= temp;
                    swap++;
                    swapped= true;
                }
            }
            if(swapped==false){
                break;
            }
        }
        System.out.print("Number of Swaps: "+swap+"\n");
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
        bubbleSort(arr);
        printArray(arr);
    }
}