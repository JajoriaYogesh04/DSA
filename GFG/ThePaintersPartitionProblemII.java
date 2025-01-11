

// User function Template for Java

class Solution {
    public int countPainters(int arr[],int k,int time){
        int sum=0;
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+sum<=time) sum+=arr[i];
            else{
                sum=arr[i];
                count++;
                if(count>k) break;
            }
        }
        return count;
    }
    public int minTime(int[] arr, int k) {
        // code here
        int si=Integer.MIN_VALUE;
        int ei=0;
        for(int i=0;i<arr.length;i++){
            si=Math.max(si,arr[i]);
            ei+=arr[i];
        }
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(countPainters(arr,k,mi)<=k) ei=mi-1;
            else si=mi+1;
        }
        return si;
    }
}