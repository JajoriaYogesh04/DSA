//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            // System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    void merge(int arr[], int l, int r, int mid){
        int temp[]= new int[r-l+1];
        int i= l;
        int j= mid+1;
        int k= 0;
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                temp[k]= arr[i];
                i++;
                k++;
            }
            else{
                temp[k]= arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k]= arr[i];
            i++;
            k++;
        }
        while(j<=r){
            temp[k]= arr[j];
            j++;
            k++;
        }
        for(k=0, i=l; k<temp.length; k++, i++){
            arr[i]= temp[k];
        }
    }
    void mergeSort(int arr[], int l, int r) {
        if(l>=r){
            return;
        }
        // code here
        int mid= l+(r-l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, r, mid);
    }
}
