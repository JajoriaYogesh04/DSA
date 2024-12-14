import java.util.* ;
import java.io.*; 
public class Solution {
    public static long merge(long arr[], int si, int mid, int ei){
        long count=0;
        long temp[]= new long[ei-si+1];
        int i=si;
        int j= mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }
            else{
                temp[k]=arr[j];
                count+=(mid-i+1);
                k++;
                j++;
            }
        }
        while(i<=mid){
            temp[k]=arr[i];
            k++;
            i++;
        }
        while(j<=ei){
            temp[k]= arr[j];
            j++;
            k++;
        }
        for(int l=0; l<temp.length; l++){
            arr[l+si]= temp[l];
        }
        return count;
    }
    public static long mergeSort(long arr[], int start, int end){
        long count=0;
        int mid= start+(end-start)/2;
        if(start>=end){
            return count;
        }
        count+=mergeSort(arr, start, mid);
        count+=mergeSort(arr, mid+1, end);
        count+=merge(arr, start, mid, end);
        return count;
    }
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        return mergeSort(arr, 0, n-1);
    }
}