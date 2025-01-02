public class Solution {
    public static int power(int base, int pow, int num){
        long ans=1;
        for(int i=0; i<pow; i++){
            ans*=base;
            if(ans>num){
                return 2;
            }
        }
        if(ans==num){
            return 1;
        }
        return 0;
    }
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int si=1;
        int ei=m;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            int ans= power(mi, n, m);
            if(ans==1){
                return mi;
            }
            else if(ans==2){
                ei=mi-1;
            }
            else if(ans==0){
                si=mi+1;
            }
        }
        return -1;
    }
}
