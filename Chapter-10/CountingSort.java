import java.util.*;
public class CountingSort{
    public static void countingSort(int arr[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest= arr[i];
            }
        }
        int counting[]= new int[largest+1];
        for(int i=0; i<counting.length; i++){
            counting[arr[i]]+=1;
        }
        int j=0;
        for(int i=0; i<counting.length; i++){
            while(counting[i]>0){
                arr[j]=i;
                j++;
                counting[i]--;
            }
        }
        printArray(arr);
        // printArray(counting);

    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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
        int arr[]= new int[length];
        inputArray(arr);
        countingSort(arr);
    }
}