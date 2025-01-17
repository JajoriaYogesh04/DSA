// public class Solution {
//     public static int minimumRateToEatBananas(int []v, int h) {
//         // Write Your Code Here
//         int k=Integer.MIN_VALUE;
//         for(int i=0; i<v.length; i++){
//             k= Math.max(k, v[i]);
//         }
//         for(int i=1; i<=k; i++){
//             int sum=0;
//             for(int j=0; j<v.length; j++){
//                 sum+=Math.ceil((double)v[j]/(double)i);
//             }
//             if(sum<=h){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }



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



