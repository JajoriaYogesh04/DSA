

// User function Template for Java

class Solution {
    public static boolean isPossible(int arr[],int mi,int m,int k){
        int count=0;
        int boq=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mi){
                count++;
            }
            else{
                boq+=(count/k);
                count=0;
            }
        }
        boq+=(count/k);
        if(boq>=m){
            return true;
        }
        return false;
    }
    public static int minDaysBloom(int m, int k, int[] arr) {
        // code here
        if((long)m*k>arr.length) return -1;
        int si=Integer.MAX_VALUE;
        int ei=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            si=Math.min(si,arr[i]);
            ei=Math.max(ei,arr[i]);
        }
        int ans=0;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(isPossible(arr,mi,m,k)){
                ans=mi;
                ei=mi-1;
            }
            else{
                si=mi+1;
            }
        }
        return ans;
    }
}