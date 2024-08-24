import java.util.*;
public class Sorted {
    public static boolean sortedArray(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sortedArray(arr, i+1);
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
        System.out.print("Enter number of elements: ");
        int n= sc.nextInt();
        int arr[]= new int [n];
        inputArray(arr);
        System.out.println(sortedArray(arr, 0));
    }
}