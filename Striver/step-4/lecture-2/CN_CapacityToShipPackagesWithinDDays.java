import java.util.* ;
import java.io.*; 
public class Solution {
    public static int isPossible(int arr[],int limit,int d){
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
        for(int i=si;i<=ei;i++){
            if(isPossible(weights, i, d)<=d){
                return i;
            }
        }
        return -1;
    }
}