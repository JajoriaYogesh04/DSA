import java.util.*;
public class SortedRotatedArraySearch {
    public static int sortedRotatedArraySearch(int arr[], int si, int ei, int target){
        int mid= si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=target && target<=arr[mid]){
                return sortedRotatedArraySearch(arr, si, mid-1, target);
            }
            else{
                return sortedRotatedArraySearch(arr, mid+1, ei, target);
            }
        }
        else{
            if(arr[mid]<=target && target<=arr[ei]){
                return sortedRotatedArraySearch(arr, mid+1, ei, target);
            }
            else{
                return sortedRotatedArraySearch(arr, si, mid-1, target);
            }
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
        int arr[]= new int[length];
        inputArray(arr);
        System.out.print("Enter Target: ");
        int target= sc.nextInt();
        int start= 0;
        int end= arr.length-1;
        System.out.println(sortedRotatedArraySearch(arr, start, end, target));
    }
}