import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int arr[], int start, int end){
        int mid= start+(end-start)/2;
        if(start>=end){
            return;
        }
        mergeSort(arr, start, mid);                             //left array sort
        mergeSort(arr, mid+1, end);                             //right array sort
        merge(arr, start, mid, end);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int tempArr[]= new int[ei-si+1];
        int i= si;
        int j= mid+1;
        int k= 0;
        while (i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                tempArr[k]= arr[i];
                i++;
            }
            else{
                tempArr[k]= arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            tempArr[k]= arr[i];
            i++;
            k++;
        }
        while (j<=ei) {
            tempArr[k]= arr[j];
            k++;
            j++;
        }
        // printArray(tempArr);
        for(k=0, i=si; k<tempArr.length; k++, i++){
            arr[i]=tempArr[k];
        }
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
        System.out.print("Enter Length: ");
        int length= sc.nextInt();
        int arr[]= new int[length];
        inputArray(arr);
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}