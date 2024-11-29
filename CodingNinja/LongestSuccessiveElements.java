import java.util.*;
public class Solution {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        if(a.length==0){
            return 0;
        }
        if(a.length==1){
            return 1;
        }
        int count= 0;
        int maxCount= 0;
        int lastSmall= Integer.MIN_VALUE;
        Arrays.sort(a);
        for(int i=0; i<a.length; i++){
            if(a[i]-1==lastSmall){
                count++;
                lastSmall= a[i];
            }
            else if(lastSmall != a[i]){
                count= 1;
                lastSmall= a[i];
            }
            if(count>maxCount){
                maxCount= count;
            }
        }
        return maxCount;
    }
}