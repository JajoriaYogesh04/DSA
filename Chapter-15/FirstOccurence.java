import java.util.Scanner;

public class FirstOccurence {
    public static int firstOccurence(int arr[], int i, int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, i+1, key);
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
        int i= 0;
        System.out.println(firstOccurence(arr, i, key));
    }
}