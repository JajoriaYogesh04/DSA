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
                return true;
            }
        }
        return false;
    }
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        Arrays.sort(stalls);
        int n=stalls.length;
        int si=1;
        int ei=stalls[n-1]-stalls[0];
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(canPlace(stalls,mi,k)){
                si=mi+1;
            }
            else{
                ei=mi-1;
            }
        }
        return ei;
    }
}