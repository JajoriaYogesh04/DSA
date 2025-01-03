public class Solution {
    public static int minimumRateToEatBananas(int []v, int h) {
        // Write Your Code Here
        int k=Integer.MIN_VALUE;
        for(int i=0; i<v.length; i++){
            k= Math.max(k, v[i]);
        }
        for(int i=1; i<=k; i++){
            int sum=0;
            for(int j=0; j<v.length; j++){
                sum+=Math.ceil((double)v[j]/(double)i);
            }
            if(sum<=h){
                return i;
            }
        }
        return -1;
    }
}



