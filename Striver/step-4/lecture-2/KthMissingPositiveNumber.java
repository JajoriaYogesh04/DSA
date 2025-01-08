// public class Solution {
//     public static int missingK(int[] vec, int n, int k) {
//         // Write your code here.
//         for(int i=0;i<vec.length;i++){
//             if(vec[i]<=k){
//                 k++;
//             }
//             else{
//                 break;
//             }
//         }
//         return k;
//     }
// }



public class Solution {
    public static int missingK(int[] vec, int n, int k) {
        // Write your code here.
        if(k<vec[0]){
            return k;
        }
        int si=0;
        int ei=n-1;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            int miss= vec[mi]-(mi+1);
            if(miss<k){
                si=mi+1;
            }
            else{
                ei=mi-1;
            }
        }
        return ei+k+1;
    }
}