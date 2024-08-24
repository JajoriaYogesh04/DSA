import java.util.Scanner;

public class LastOccurence {
    // public static int lastOccurence(int arr[], int i, int key){
    //     if(i<0){
    //         return -1;
    //     }
    //     if(arr[i]==key){
    //         return i;
    //     }
    //     return lastOccurence(arr, i-1, key);
    // }
    public static int lastOccurence(int arr[], int i, int key){
        if(i==arr.length){
            return -1;
        }
        int isFound= lastOccurence(arr, i+1, key);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
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
        System.out.print("Enter key: ");
        int key= sc.nextInt();
        // int i= arr.length-1;
        int i= 0;
        System.out.println(lastOccurence(arr, i, key));
    }
}