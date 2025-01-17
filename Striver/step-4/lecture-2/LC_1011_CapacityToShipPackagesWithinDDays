class Solution {
    public int countDays(int arr[], int limit, int days){
        int sum=0;
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+sum<=limit){
                sum+=arr[i];
            }
            else{
                count++;
                sum=arr[i];
                if(count>days){
                    break;
                }
            }
        }
        return count;
    }
    public int shipWithinDays(int[] weights, int days) {
        int si=Integer.MIN_VALUE;
        int ei=0;
        for(int i=0;i<weights.length;i++){
            si=Math.max(si,weights[i]);
            ei+=weights[i];
        }
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(countDays(weights,mi,days)<=days){
                ei=mi-1;
            }
            else{
                si=mi+1;
            }
        }
        return si;
    }
}