import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void swap(int arr[], int i, int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static void sort012(int[] arr)
    {
        //Write your code here
        int low= 0;
        int mid= 0;
        int high= arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
}