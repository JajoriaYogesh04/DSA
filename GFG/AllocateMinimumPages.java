


//Back-end complete function Template for Java

class Solution {
    public static int countStudents(int arr[],int k,int pages){
        int count=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=pages){
                sum+=arr[i];
            }
            else{
                sum=arr[i];
                count++;
                if(count>k){
                    break;
                }
            }
        }
        return count;
    }
    public static int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length) return -1;
        int si=Integer.MIN_VALUE;
        int ei=0;
        for(int i=0;i<arr.length;i++){
            si=Math.max(si,arr[i]);
            ei+=arr[i];
        }
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(countStudents(arr,k,mi)<=k){
                ei=mi-1;
            }
            else{
                si=mi+1;
            }
        }
        return si;
    }
}