public class MergeSort {
    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid= si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, ei, mid);
    }
    public static void merge(int arr[], int si, int ei, int mid){
        int i=si;
        int j= mid+1;
        int k=0;
        int temp[]= new int[ei-si+1];
        while(i<=mid && j<=ei){
            if(arr[i]>arr[j]){
                temp[k]= arr[j];
                j++;
                k++;
            }
            else{
                temp[k]= arr[i];
                i++;
                k++;
            }
        }
        while(i<=mid){
            temp[k]= arr[i];
            i++;
            k++;
        }
        while(j<=ei){
            temp[k]= arr[j];
            j++;
            k++;
        }
        for(int l=0; l<k; l++){
            arr[si+l]= temp[l];
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] ={5,2,3,4,1,6};
        int si= 0;
        int ei= arr.length-1;
        mergeSort(arr, si, ei);
        printArray(arr);

    }
}