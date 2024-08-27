import java.util.*;
public class PracticeQuestion1 {
    public static void occurrences(int arr[], int key, int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        occurrences(arr, key, i+1);
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
        int length= sc.nextInt();
        int arr[]= new int[length];
        inputArray(arr);
        int key= 2;
        occurrences(arr, key, 0);
    }
}