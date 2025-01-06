public class Solution {
    public static boolean isPossible(int arr[],int div,int limit){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/div);
        }
        return sum<=limit;
    }
    public static int smallestDivisor(int arr[], int limit) {
        // Write your coder here
        int ei=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            ei=Math.max(arr[i],ei);
        }
        int si=1;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(isPossible(arr, mi, limit)){
                ei=mi-1;
            }
            else{
                si=mi+1;
            }
        }
        return si;
    }
}