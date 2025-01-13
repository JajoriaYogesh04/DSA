class Solution {
    public static boolean Search(int[] arr, int k) {
        // code here
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(arr[mi]==k){
                return true;
            }
            else if(arr[si]==arr[mi] && arr[mi]==arr[ei]){
                si++;
                ei--;
                continue;
            }
            else if(arr[si]<=arr[mi]){
                if(arr[si]<=k && k<=arr[mi]){
                    ei=mi-1;
                }
                else{
                    si=mi+1;
                }
            }
            else{
                if(arr[mi]<=k && k<=arr[ei]){
                    si=mi+1;
                }
                else{
                    ei=mi-1;
                }
            }
        }
        return false;
    }
}