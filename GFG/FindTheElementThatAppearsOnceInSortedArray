

// User function Template for Java

class Solution {
    int findOnce(int[] arr) {
        // Complete this function
        int n=arr.length;
        if(n==1){
            return arr[0];
        }
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }
        int si=1;
        int ei=n-2;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(arr[mi-1]!=arr[mi] && arr[mi]!=arr[mi+1]){
                return arr[mi];
            }
            if((mi%2==1 && arr[mi-1]==arr[mi])||(mi%2==0 && arr[mi]==arr[mi+1])){
                si=mi+1;
            }
            else{
                ei=mi-1;
            }
        }
        return -1;
    }
}