

// User function Template for Java

class Solution {
    public int power(int base, int pow, int m){
        long ans=1;
        for(int i=0; i<pow; i++){
            ans*=base;
            if(ans>m){
                return 2;
            }
        }
        if(ans==m){
            return 1;
        }
        return 0;
    }
    public int nthRoot(int n, int m) {
        // code here
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