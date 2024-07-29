import java.util.*;

import javax.swing.plaf.synth.SynthStyle;

public class PrefixSum {
    public static void maxSumSubarray(int arr[]){
        int prefix[]= new int[arr.length];
        int sum= 0;
        int maxSum= Integer.MIN_VALUE;

        //prefix array;
        prefix[0]=arr[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        
        for(int i=0; i<prefix.length; i++){
            for(int j=i; j<prefix.length; j++){
                sum= i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                System.out.print(sum+" ");
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
            System.out.println();
        }
        System.out.print("Maximum Sum: "+maxSum);
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
        maxSumSubarray(arr);
    }
}