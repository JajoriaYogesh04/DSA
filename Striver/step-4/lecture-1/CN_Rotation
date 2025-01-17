public class Solution {
    public static int findKRotation(int []arr){
        // Write your code here.
        int si=0;
        int ei=arr.length-1;
        int min=Integer.MAX_VALUE;
        int idx=-1;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(arr[si]<=arr[ei]){
                if(arr[si]<min){
                    min=arr[si];
                    idx=si;
                }
                break;
            }
            if(arr[si]<=arr[mi]){
                if(arr[si]<min){
                    min=arr[si];
                    idx=si;
                }
                si=mi+1;
            }
            else{
                if(arr[mi]<min){
                    min=arr[mi];
                    idx=mi;
                }
                ei=mi-1;
            }
        }
        return idx;
    }
}