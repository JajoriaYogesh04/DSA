import java.util.*;
public class Solution {
    public static int subarraycount(ArrayList<Integer> arr, int total){
        int count=1;
        int sum=0;
        for(int i=0; i<arr.size(); i++){
            if(sum+arr.get(i)<=total){
                sum+=arr.get(i);
            }
            else{
                sum=arr.get(i);
                count++;
            }
        }
        return count;
    }
    public static int splitArray(ArrayList<Integer> array, int k) {
        // Write your code here.
        int low= Integer.MIN_VALUE;
        int high= 0;
        for(int i=0; i<array.size(); i++){
            low= Math.max(low, array.get(i));
            high+=array.get(i);
        }
        while(low<=high){
            int mid= low+(high-low)/2;
            if(subarraycount(array, mid)>k){
                low= mid+1;
            }
            else{
                high= mid-1;
            }
        }
        return low;
    }
}