import java.util.*;

public class PairArray {
    public static void pairArray(int arr[]){
        int totalPair= 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1;j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: "+totalPair);
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
        System.out.print("Enter length: ");
        int length= sc.nextInt();
        int arr[]= new int [length];
        inputArray(arr);
        pairArray(arr);
    }
}