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
        if(r*b>arr.length){
            return -1;
        }
        int si=Integer.MAX_VALUE;
        int ei=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            si=Math.min(arr[i],si);
            ei=Math.max(arr[i],ei);
        }
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(isPossible(arr, mi, r, b)){
                ei=mi-1;
            }
            else{
                si=mi+1;
            }
        }
        return si;
    }
}