public class Solution {
    public static int subarrayWithMaxProduct(int []arr){
        // Write your code here.
        int max= Integer.MIN_VALUE;
        int pre= 1;
        int suf= 1;
        for(int i=0; i<arr.length; i++){
            if(pre==0){
                pre= 1;
            }
            if(suf==0){
                suf= 1;
            }
            pre*=arr[i];
            suf*=arr[arr.length-i-1];
            max= Math.max(max, Math.max(pre, suf));
        }
        return max;
    }
}