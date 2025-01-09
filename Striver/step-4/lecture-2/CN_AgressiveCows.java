import java.util.*;
public class Solution {
    public static boolean canPlace(int arr[],int dist,int k){
        int count=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dist){
                count++;
                last=arr[i];
            }
            if(count>=k){
                break;
            }
        }
        return count>=k;
    }
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        Arrays.sort(stalls);
        int n=stalls.length;
        int ans=-1;
        for(int i=1; i<=(stalls[n-1]-stalls[0]);i++){
            if(canPlace(stalls,i,k)){
                ans=i; 
            }
            else{
                break;
            }
        }
        return ans;
    }
}