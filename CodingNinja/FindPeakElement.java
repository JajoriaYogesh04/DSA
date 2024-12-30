import java.util.ArrayList;
public class Solution {
    public static int findPeakElement(ArrayList<Integer> arr) {
        // Write your code here.
        int n= arr.size();
        if(n==1){
            return 0;
        }
        if(arr.get(0)>arr.get(1)){
            return 0;
        }
        if(arr.get(n-1)>arr.get(n-2)){
            return n-1;
        }
        int si=1;
        int ei=n-2;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(arr.get(mi-1)<arr.get(mi) && arr.get(mi)>arr.get(mi+1)){
                return mi;
            }
            else if(arr.get(si)<=arr.get(mi) && arr.get(mi+1)>arr.get(mi)){
                si=mi+1;
            }
            else{
                ei=mi-1;
            }
        }
        return -1;
    }
};
