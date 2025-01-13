

// User function Template for Java

class Solution {
    static int merge(int arr[], int si, int mi, int ei){
        int count=0;
        int temp[]= new int[ei-si+1];
        int i=si;
        int j=mi+1;
        int k=0;
        while(i<=mi && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]= arr[i];
                k++;
                i++;
            }
            else{
                temp[k]= arr[j];
                
                count+=mi-i+1;
                k++;
                j++;
            }
        }
        while(i<=mi){
            temp[k]= arr[i];
            k++;
            i++;
        }
        while(j<=ei){
            temp[k]= arr[j];
            k++;
            j++;
        }
        for(int l=0; l<temp.length; l++){
            arr[si+l]= temp[l];
        }
        return count;
    }
    // Function to count inversions in the array.
    static int mergeSort(int arr[], int start, int end){
        int count=0;
        int mid= start+(end-start)/2;
        if(start>=end){
            return count;
        }
        count+=mergeSort(arr, start, mid);
        count+=mergeSort(arr, mid+1, end);
        count+=merge(arr, start, mid, end);
        return count;
    }
    static int inversionCount(int arr[]) {
        // Your Code Here
        return mergeSort(arr, 0, arr.length-1);
    }
}