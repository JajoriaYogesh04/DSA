public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int count= 1;
        if(n==1){
            return count;
        }
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                count++;
            }
        }
        return count;
    }
}