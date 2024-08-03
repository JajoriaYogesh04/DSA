import java.util.*;

public class PracticeQuestion2{
    public static void pivot(int arr[]){
        int temp= arr[0];;
        for(int i=0; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
    public static void multiplePivot(int arr[], int k){
        for(int i=1; i<=k; i++){
            pivot(arr);
        }
    }
    public static int search(int arr[], int target){
        int start= 0;
        int end= arr.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[start]>arr[mid]){          //right sorted
                if(arr[mid]<=target && target<=arr[end]){
                    start= mid+1;
                }
                else{
                    end= mid-1;
                }
            }
            else{                                   //left sorted
                if(arr[start]<=target && target<=arr[mid]){
                    end= mid-1;
                }
                else{
                    start= mid+1;
                }
            }
        }
        return -1;
    } 
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
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

        System.out.print("Enter Pivot: ");
        int pivot= sc.nextInt();
        multiplePivot(arr, pivot);
        // printArray(arr);
        System.out.print("Enter Target: ");
        int target= sc.nextInt();
        
        int index= search(arr, target);
        System.out.println("Index of "+target+" : "+index);
    }
}