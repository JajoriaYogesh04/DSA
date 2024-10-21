public class Solution {
    public static int[] helper(int x, int arr[]){
        if(x==0){
            return arr;
        }
        arr[x-1]= x;
        return helper(x-1, arr);
    }
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[]= new int[x];
        return helper(x, arr);
    }
}