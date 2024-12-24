import java.util.ArrayList;
public class Solution {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int si=0;
        int ei=n-1;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(arr.get(mi)==k){
                return mi;
            }
            else if(arr.get(si)<arr.get(mi)){
                if(arr.get(si)<=k && k<=arr.get(mi)){
                    ei= mi-1;
                }
                else{
                    si=mi+1;
                }
            }
            else{
                if(arr.get(mi)<=k && k<=arr.get(ei)){
                    si=mi+1;
                }
                else{
                    ei=mi-1;
                }
            }
        }
        return -1;
    }
}