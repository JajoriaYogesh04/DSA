

// User function Template for Java

class Solution {
    static int countDays(int arr[],int limit,int d){
        int sum=0;
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+sum<=limit){
                sum+=arr[i];
            }
            else{
                count++;
                sum=arr[i];
                if(count>d){
                    break;
                }
            }
        }
        return count;
    }
    static int leastWeightCapacity(int[] arr, int n, int d) {
        // code here
        int si=Integer.MIN_VALUE;
        int ei=0;
        for(int i=0;i<arr.length;i++){
            si=Math.max(arr[i],si);
            ei+=arr[i];
        }
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(countDays(arr,mi,d)<=d){
                ei=mi-1;
            }
            else{
                si=mi+1;
            }
        }
        return si;
    }
};