import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void merge(ArrayList<Integer> arr, int si, int mi, int ei){
        int temp[]= new int[ei-si+1];
        int i= si;
        int j= mi+1;
        int k=0;
        while(i<=mi && j<=ei){
            if(arr.get(i)<=arr.get(j)){
                temp[k]= arr.get(i);
                k++;
                i++;
            }
            else{
                temp[k]= arr.get(j);
                j++;
                k++;
            }
        }
        while(i<=mi){
            temp[k]= arr.get(i);
            i++;
            k++;
        }
        while(j<=ei){
            temp[k]= arr.get(j);
            j++;
            k++;
        }
        for(int l=0; l<temp.length; l++){
            arr.set(l+si, temp[l]);
        }
    }
    public static int countPairs(ArrayList<Integer> arr, int si, int mi, int ei){
        int right= mi+1;
        int count=0;
        for(int left=si; left<=mi; left++){
            while(right<=ei && arr.get(left)>2*arr.get(right)){
                right++;
            }
            count+=(right-(mi+1));
        }
        return count;
    }
    public static int mergeSort(ArrayList<Integer> arr, int start, int end){
        int count= 0;
        if(start>=end){
            return count;
        }
        int mid= start+(end-start)/2;
        count+=mergeSort(arr, start, mid);
        count+=mergeSort(arr, mid+1, end);
        count+=countPairs(arr, start, mid, end);
        merge(arr, start, mid, end);
        return count;
    }
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        // Write your code here.
        return mergeSort(arr, 0, arr.size()-1);
    }
}