import java.util.*;

public class KadanesAlgorithm {
    public static void kadanesAlgorithm(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            currSum+=arr[i];
            if(currSum<0){
                currSum=0;
            }
            if(currSum>maxSum){
                maxSum=currSum;
            }
        }
        System.out.println("Current Sum: "+currSum);
        System.out.println("Maximum Sum: "+maxSum);
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
        int arr[]= new int [length];
        inputArray(arr);
        kadanesAlgorithm(arr);
    }
}