public class Solution {
    public static boolean isPossible(int arr[],int i,int r,int b){
        int count=0;
        int boq=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]<=i){
                count++;
            }
            else{
                boq+=(count/r);
                count=0;
            }
        }
        boq+=(count/r);
        if(boq>=b){
            return true;
        }
        return false;
    }
    public static int roseGarden(int[] arr, int r, int b) {
        // Write your code here.
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(arr[i],min);
            max=Math.max(arr[i],max);
        }
        for(int i=min;i<=max;i++){
            if(isPossible(arr, i, r, b)){
                return i;
            }
        }
        return -1;
    }
}