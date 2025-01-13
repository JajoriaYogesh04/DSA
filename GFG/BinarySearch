

// User function Template for Java

class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int si= 0;
        int ei= arr.length-1;
        while(si<=ei){
            int mid= si+(ei-si)/2;
            if(arr[mid]==k){
                if(mid==0 || arr[mid-1]!=k){
                    return mid;
                }
                else{
                    ei= mid-1;
                }
            }
            else if(arr[mid]<k){
                si= mid+1;
            }
            else{
                ei= mid-1;
            }
        }
        return -1;
    }
}