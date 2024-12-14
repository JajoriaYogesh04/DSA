public class Solution {
    public static int count=0;
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]= new int[ei-si+1];
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
    }
    public static void mergeSort(int arr[], int start, int end){
        int mid= start+(end-start)/2;
        if(start>=end){
            return;
        }
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
    public static int numberOfInversions(int []a, int n) {
        // Write your code here.
        mergeSort(a, 0, n-1);
        return count;
    }
}