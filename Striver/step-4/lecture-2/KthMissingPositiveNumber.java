public class Solution {
    public static int missingK(int[] vec, int n, int k) {
        // Write your code here.
        for(int i=0;i<vec.length;i++){
            if(vec[i]<=k){
                k++;
            }
            else{
                break;
            }
        }
        return k;
    }
}