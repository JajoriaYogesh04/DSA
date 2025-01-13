

// User function Template for Java

class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(arr[mi]==key){
                return mi;
            }
            else if(arr[si]<=arr[mi]){
                if(arr[si]<=key && key<=arr[mi]){
                    ei=mi-1;
                }
                else{
                    si=mi+1;
                }
            }
            else{
                if(arr[mi]<=key && key<=arr[ei]){
                    si=mi+1;
                }
                else{
                    ei=mi-1;
                }
            }
        }
        return -1;
    }
}