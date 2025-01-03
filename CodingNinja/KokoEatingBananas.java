public class Solution {
    public static int minimumRateToEatBananas(int []v, int h) {
        // Write Your Code Here
        int ei=Integer.MIN_VALUE;
        for(int i=0; i<v.length; i++){
            ei= Math.max(ei, v[i]);
        }
        int si=1;
        int ans=-1;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            long time=0;
            for(int j=0; j<v.length; j++){
                time+=(v[j]+mi-1)/mi;
            }
            if(time<=h){
                ans=mi;
                ei=mi-1;
            }
            else{
                si=mi+1;
            }
        }
        return ans;
    }
}



