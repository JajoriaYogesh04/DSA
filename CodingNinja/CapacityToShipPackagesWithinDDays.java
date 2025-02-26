import java.util.* ;
import java.io.*; 
public class Solution {
    public static int countDays(int arr[],int limit,int d){
        int sum=0;
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=limit){
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
    public static int leastWeightCapacity(int[] weights, int d) {
        // Write your code here.
        int si=Integer.MIN_VALUE;
        int ei=0;
        for(int i=0;i<weights.length;i++){
            si=Math.max(si,weights[i]);
            ei+=weights[i];
        }
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(countDays(weights,mi,d)<=d){
                ei=mi-1;
            }
            else{
                si=mi+1;
            }
        }
        return si;
    }
}