import java.util.*;

public class SubArrays {
    public static void subArrays(int arr[]){
        int ts= 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    System.out.print("["+arr[k]+"]");
                    sum+=arr[k];
                }
                System.out.print("="+sum+"    ");
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: "+ts);
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
        subArrays(arr);
    }   
}