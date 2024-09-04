public class QuickSort {
    // public static void quickSort(int arr[], int i, int j){
    //     int pIdx= partition(arr,)
    //     if(j>=arr.length){
    //         return;
    //     }
    //     if(arr[j]<=partition){
    //         i++;
    //         int temp= arr[i];
    //         arr[i]= arr[j];
    //         arr[j]= temp;
    //     }
    //     quickSort(arr, i, j+1, partition);
    // }
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pIdx= partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
        partition(arr, si, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int i= si-1;
        int j= si;
        int pivot= arr[ei];
        for(j= si; j<ei; j++){
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
    public static void main(String args[]){
        int arr[]= {6,3,9,8,2,5};
        int start= 0;
        int end= arr.length-1;
        quickSort(arr, start, end);
        printArray(arr);
    }
}