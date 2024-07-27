import java.util.*;

public class LargestNumber{
    public static void inputArray(int arr[]){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter number: ");
            arr[i]= sc.nextInt();
        }
    }
    public static int largestNumber(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=largest){
                largest= arr[i];
            }
        }
        return largest;
    }
    public static int smallestNumber(int arr[]){
        int smallest= Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=smallest){
                smallest= arr[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int len= sc.nextInt();
        int arr[]= new int[len];
        inputArray(arr);
        int largestNumber= largestNumber(arr);
        System.out.println("Largest number: "+largestNumber);
        int smallestNumber= smallestNumber(arr);
        System.out.println("Smallest number: "+smallestNumber);
    }
}