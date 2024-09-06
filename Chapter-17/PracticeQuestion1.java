import java.util.*;
public class PracticeQuestion1 {
    public static void mergeSort(String arr[], int start, int end){
        int mid= start+(end-start)/2;
        if(start>=end){
            return;
        }
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, end, mid);
    }
    public static void merge(String arr[], int si, int ei, int mid){
        int i=si;
        int j=mid+1;
        int k=0;
        String tempArr[]= new String[ei-si+1]; 
        while (i<=mid && j<=ei) {
            if(arr[i].compareTo(arr[j])<0){
                tempArr[k]= arr[i];
                i++;
            }
            else{
                tempArr[k]= arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            tempArr[k]= arr[i];
            i++;
            k++;
        }
        while(j<=ei){
            tempArr[k]= arr[j];
            j++;
            k++;
        }
        for(int l=0; l<tempArr.length; l++){
            arr[si+l]= tempArr[l];
        }
    }
    public static void printArray(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void inputArray(String arr[]){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter: ");
            arr[i]= sc.next();
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int length= sc.nextInt();
        String arr[]= new String[length];
        inputArray(arr);
        int start= 0;
        int end= arr.length-1;
        mergeSort(arr, start, end);
        printArray(arr);
    }
}