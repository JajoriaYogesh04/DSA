import java.util.*;
public class PracticeQuestion2 {
    public static void quickSort(int arr[], int start, int end){
        // int mid= start+(end-start)/2;
        if(start>=end){
            return;
        }
        
        int pIdx= partition(arr, start, end);
        quickSort(arr, start, pIdx-1);
        quickSort(arr, pIdx+1, end);
    }
    public static int partition(int arr[], int si, int ei){
        int i= si-1;
        int j=si;
        int pivot= arr[ei];
        for(j=si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        i++;
        int temp= pivot;
        arr[ei]= arr[i];
        arr[i]= temp;
        return i;
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
        int nums[]= new int[length];
        inputArray(nums);
        quickSort(nums, 0, nums.length-1);
        // printArray(nums);
        int mid= (nums.length-1)/2;
        System.out.println(nums[mid]);
    }
}