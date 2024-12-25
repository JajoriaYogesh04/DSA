public class Solution {
    public static boolean searchInARotatedSortedArrayII(int []A, int key) {
        // Write your code here.
        int si=0;
        int ei= A.length-1;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(A[mi]==key){
                return true;
            }
            if(A[si]==A[mi] && A[mi]==A[ei]){
                si++;
                ei--;
                continue;
            }
            else if(A[si]<=A[mi]){
                if(A[si]<=key && key<=A[mi]){
                    ei=mi-1;
                }
                else{
                    si=mi+1;
                }
            }
            else{
                if(A[mi]<=key && key<=A[ei]){
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