public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        for(int i=1; i<=m; i++){
            int mul=1;
            for(int j=0; j<n; j++){
                mul*=i;
            }
            if(mul==m){
                return i;
            }
            else if(mul>m){
                break; 
            }
        }
        return -1;
    }
}
