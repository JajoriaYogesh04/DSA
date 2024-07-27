import java.util.*;

public class BinarySearch{
    public static int binarySearch(int arr[], int key){
        int start= 0;
        int end= arr.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start= mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int arr[]= {2,4,6,8,10,12,14,16,18,20};
        int key= 4;
        int index= binarySearch(arr, key);
        System.out.println("Index of "+key+" : "+index);
    }
}